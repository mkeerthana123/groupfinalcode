public class PauseCommand implements Command {
    private FocusSessionReceiver session;

    public PauseCommand(FocusSessionReceiver session) {
        this.session = session;
    }

    public void execute() {
        session.pause();
    }
}