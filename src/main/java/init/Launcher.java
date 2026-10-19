package init;

import components.Producer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        for (int i = 0; i < 10; i++) {
            producer.send("topicTest", "mensaje generadoa las " + LocalDateTime.now() + " para topicTest");
            Thread.sleep(100);
        }
        producer.close();
    }
}
