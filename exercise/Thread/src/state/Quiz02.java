

package state;

import java.lang.Thread.State;

public class Quiz02 {

    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 5);
        RunnableCounter counter2 = new RunnableCounter("counter2", 5);
        counter1.start();
        counter2.start();
        counter1.join();
        counter2.join();
        Thread.State state1 = counter1.getThread().getState();
        Thread.State state2 = counter2.getThread().getState();
        if (state1 == State.TERMINATED) {
            System.out.println("counter1 stopped");
        }

        if (state2 == State.TERMINATED) {
            System.out.println("counter2 stopped");
        }

        if (state1 == State.TERMINATED && state2 == State.TERMINATED) {
            System.out.println("All threads stopped");
        }

    }
}
