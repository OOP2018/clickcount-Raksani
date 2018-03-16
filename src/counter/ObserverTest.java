package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 * @author Raksani Khunamas
 */

public class ObserverTest {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        //1.create the subject (Observable)
        Counter counter = new Counter();
        //2. Create the observer with reference to subject.
        ConsoleView view = new ConsoleView(counter);
        //3.add observer to subject
        counter.addObserver(view);
        //Create another observer.
        CounterView view2 = new CounterView(counter);
        counter.addObserver(view2);
        //4.run the app.
        view2.run();
        while (true){
            System.out.println("how much?");
            int howmuch = console.nextInt() /*read from console*/;
            counter.add(howmuch);
        }
    }
}
