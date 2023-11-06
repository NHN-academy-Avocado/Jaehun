
package state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long time;
        if (line.charAt(line.length() - 1) == 'n') {
            time = Long.parseLong(line.substring(0, line.length() - 1)) / 1000000L;
        } else {
            time = Long.parseLong(line);
        }

        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("tick");
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        thread.start();
        br.close();
    }
}
