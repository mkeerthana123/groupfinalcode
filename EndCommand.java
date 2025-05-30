public class EndCommand implements Command {
    private FocusSessionReceiver session;

    public EndCommand(FocusSessionReceiver session) {
        this.session = session;
    }

    public void execute() {
        session.end();
    }
}