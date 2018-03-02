package tools.schedule;

import java.util.concurrent.BlockingQueue;

/**
 * Hello world!
 *
 */
public class BaseScheduler{
    private static BlockingQueue<String> requestQueue;
    static{
        try {
            requestQueue.put("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
