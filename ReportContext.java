public class ReportContext {
    private ReportState state;

    public void setState(ReportState state) {
        this.state = state;
    }

    public void applyState() {
        state.handle();
    }
}