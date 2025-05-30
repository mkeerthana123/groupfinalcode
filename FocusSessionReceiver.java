public class FocusSessionReceiver {
    private String userName;

    public FocusSessionReceiver(String userName) {
        this.userName = userName;
    }

    public void start() {
        System.out.println(userName + "'s focus session started.");
    }

    public void pause() {
        System.out.println(userName + "'s focus session paused.");
    }

    public void end() {
        System.out.println(userName + "'s focus session ended.");
    }
}