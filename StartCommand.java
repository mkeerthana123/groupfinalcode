public class StartCommand implements Command {
    private FocusSessionReceiver session;

    public StartCommand(FocusSessionReceiver session) {
        this.session = session;
    }

    public void execute() {
        session.start();
    }
}