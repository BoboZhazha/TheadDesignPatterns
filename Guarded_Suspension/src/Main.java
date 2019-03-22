
public class Main {

    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "张善波", 3141592L).start();
        new ServerThead(requestQueue, "万璐露", 6535897L).start();
    }
}
