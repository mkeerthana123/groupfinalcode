public class ReportManager {
    private static ReportManager instance = new ReportManager();

    private ReportManager() {}

    public static ReportManager getInstance() {
        return instance;
    }

    public void generateReport(String type, String service) {
        System.out.println("ReportManager: Generating " + type + " report for " + service + " service...");
    }
}