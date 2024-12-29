package Dans;

import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Application {

    private static AtomicInteger sheepCount1 = new AtomicInteger(0); // w1
    private static int sheepCount2 = 0;

    public static void main(String[] args) throws InterruptedException {
//        IntStream is = IntStream.empty();
//
//        System.out.println(is.findAny());
//        is.av

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // w2

            for(int i=0; i<100; i++)
                service.execute(() ->
                {sheepCount1.getAndIncrement(); sheepCount2++;}); // w3
            Thread.sleep(100);
            System.out.println(sheepCount1+" "+sheepCount2);
        } finally {
            if(service != null) service.shutdown();
        }

//        Paths.
    }

//    private static void print(Properties props) {
//        System.out.println(props.get("veggies", "none")
//                + " " + props.get("omni", "none"));
//    }
}
