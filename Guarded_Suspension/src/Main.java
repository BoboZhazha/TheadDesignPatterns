
public class Main {

    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "zhangsan", 3141592L).start();
        new ServerThead(requestQueue, "lisi", 6535897L).start();
    }
}
