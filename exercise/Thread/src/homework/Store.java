package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import javax.swing.plaf.SeparatorUI;

public class Store {
    private static final int MAX_ITEM = 10;
    private static final int MAX_CONSUMER = 5;
    private int consumer;
    private Semaphore storeSemaphore;


    ArrayList<String> item = new ArrayList<>();
    private Map<String, Integer> inventory;
    private Map<String, Semaphore> semaphores;

    String[] foodList = {"사과", "바나나", "딸기"};

    public Store() {
        this.storeSemaphore = new Semaphore(MAX_CONSUMER);
        this.inventory = new HashMap<>();
        this.semaphores = new HashMap<>();
        for(String item: foodList){
            inventory.put(item, 0);
            semaphores.put(item, new Semaphore(MAX_ITEM));
        }
    }

    public void enter() throws InterruptedException {
        storeSemaphore.acquire();
        System.out.println(Thread.currentThread().getName() + "  입장합니다");

    }

    public void exit() {
        storeSemaphore.release();
        System.out.println(Thread.currentThread().getName() + "  퇴장합니다");

    }

    public void buy(String name) throws InterruptedException {
        Semaphore semaphore = semaphores.get(name);
        semaphore.acquire(); // 해당 물품에 대한 세마포어 획득

        synchronized (this) {
            while (inventory.get(name) == 0) {
                wait(); // 해당 물품이 없으면 대기
            }
            inventory.put(name, inventory.get(name) - 1); // 물품 구매
            System.out.println(name + " 구매. 남은 수량: " + inventory.get(name));
        }
        semaphore.release(); // 세마포어 반환
    }

    public synchronized void sell(String name) throws InterruptedException {
        while (inventory.get(name) == MAX_ITEM) {
            wait(); // 해당 물품이 가득 차면 대기
        }
        inventory.put(name, inventory.get(name) + 1); // 물품 입고
        System.out.println(name + " 입고. 현재 수량: " + inventory.get(name));
        notifyAll(); // 소비자에게 알림
    }


    public int getItemNumber() {
        return foodList.length;
    }
}
