import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Productivity Management System ---");
            System.out.println("1. Start Focus Session");
            System.out.println("2. Generate Performance Report");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    FocusSessionReceiver session = new FocusSessionReceiver(name);
                    SessionInvoker invoker = new SessionInvoker();
                    invoker.setCommand(new StartCommand(session));
                    invoker.executeCommand();
                    invoker.setCommand(new PauseCommand(session));
                    invoker.executeCommand();
                    invoker.setCommand(new StartCommand(session)); // resume
                    invoker.executeCommand();
                    invoker.setCommand(new EndCommand(session));
                    invoker.executeCommand();
                    break;
                case 2:
                    ReportContext context = new ReportContext();
                    context.setState(new GeneratingState());
                    context.applyState();
                    ReportManager manager = ReportManager.getInstance();
                    RequestData request = new RequestData("Daily", "Focus Session");
                    Command reportCommand = new GenerateDailyReportCommand(manager, request);
                    Invoker reportInvoker = new Invoker();
                    reportInvoker.setCommand(reportCommand);
                    reportInvoker.executeCommand();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Goodbye!");
    }
}