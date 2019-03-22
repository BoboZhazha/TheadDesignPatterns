import java.util.Random;

public class ServerThead extends Thread{
    private final Random random;
    private final RequestQueue requestQueue;

    public ServerThead(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for (int i = 0; i< 100; i++) {
            Request request = requestQueue.getRequet();
            System.out.println(Thread.currentThread().getName() + "处理了" + request);

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
