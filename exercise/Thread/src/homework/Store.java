package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    private static final int MAX_ITEM = 10;
    private static final int MAX_CONSUMER = 5;
    private Semaphore consumerSemaphore;
    private Map<String, Integer> itemList;
    private Map<String, Semaphore> itemSemaphore;
    private int itemCount=0;


    public Store(String[] items) {
        consumerSemaphore = new Semaphore(MAX_CONSUMER);
        itemList = new HashMap<>();
        itemSemaphore = new HashMap<>();
        for (String item : items) {
            itemList.put(item, 0);
            itemSemaphore.put(item, new Semaphore(1));
        }
    }

    public  void enter() throws InterruptedException {
        consumerSemaphore.acquire();
        System.out.println("고객 입장. 현재 매장 내 고객 수: " + (MAX_CONSUMER - consumerSemaphore.availablePermits()));
    }

    public  void exit() {
        consumerSemaphore.release();
        System.out.println("고객 퇴장. 현재 매장 내 고객 수: " + (MAX_CONSUMER - consumerSemaphore.availablePermits()));

    }

    public synchronized void buy() throws InterruptedException {
        List<String> keysAsArray = new ArrayList<>(itemList.keySet());
        String randomKey = keysAsArray.get(ThreadLocalRandom.current().nextInt(keysAsArray.size()));
        while(itemList.get(randomKey)==0){
            randomKey = keysAsArray.get(ThreadLocalRandom.current().nextInt(keysAsArray.size()));
        }
        Semaphore semaphore = itemSemaphore.get(randomKey);
        semaphore.acquire();
        itemList.put(randomKey, itemList.get(randomKey) - 1);
        itemCount--;
        System.out.println(randomKey + "구매. 남은 수량: " + itemList.get(randomKey));
        semaphore.release();
    }

    public synchronized void sell() {
        while(itemCount!=10){
            List<String> keysAsArray = new ArrayList<>(itemList.keySet());
            String randomKey = keysAsArray.get(ThreadLocalRandom.current().nextInt(keysAsArray.size()));
            itemList.put(randomKey, itemList.get(randomKey) + 1);
            itemCount++;
            notifyAll();
            System.out.println(randomKey + "추가 완료");
        }
    }
}
