public class GenerateDailyReportCommand implements Command {
    private ReportManager manager;
    private RequestData request;

    public GenerateDailyReportCommand(ReportManager manager, RequestData request) {
        this.manager = manager;
        this.request = request;
    }

    public void execute() {
        System.out.println("Executing report generation...");
        manager.generateReport(request.getReportType(), request.getServiceType());
    }
}