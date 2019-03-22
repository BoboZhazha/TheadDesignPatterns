import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();


    // 下面两个方法是这个模式等精髓, 掌握这种结构的写法
    // 守护条件不成立的时候就等,
    public synchronized Request getRequet(){
        while (queue.peek() == null) {
            try {
                // 执行wait方法,必须获得该实例的锁
                // 线程执行到wait方法时,进入等待队列,并释放持有this的锁
                wait();
            } catch (InterruptedException e) {
            }
        }
        // 执行目标
        return queue.remove();
    }

    // 放好了通知所有
    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
