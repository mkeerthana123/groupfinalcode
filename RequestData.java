public class RequestData {
    private String reportType;
    private String serviceType;

    public RequestData(String reportType, String serviceType) {
        this.reportType = reportType;
        this.serviceType = serviceType;
    }

    public String getReportType() {
        return reportType;
    }

    public String getServiceType() {
        return serviceType;
    }
}