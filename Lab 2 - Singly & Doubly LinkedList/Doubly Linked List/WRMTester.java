import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        WRM wr = new WRM();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("==Choose an option:==");
            System.out.println("1. RegisterPatient()");
            System.out.println("2. Serve Patient()");
            System.out.println("3. Cancel All()");
            System.out.println("4. CanDoctorGoHome()");
            System.out.println("5. ShowAllPatient()");
            System.out.println("6. ReverseTheLine()");
            System.out.println("7. Exit()");
            System.out.print("Enter your choice: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Blood Group: ");
                    String bg = sc.next();
                    wr.registerPatient(id, name, age, bg);
                    break;
                case 2:
                    wr.servePatient();
                    break;
                case 3:
                    wr.cancelAll();
                    break;
                case 4:
                    wr.canDoctorGoHome();
                    break;
                case 5:
                    wr.showAllPatient();
                    break;
                case 6:
                    wr.reverseTheLine();
                    break;
                case 7:
                    System.out.println("Thanks for using WRM System.");
                    sc.close();
                    return;

                default:
                    break;
            }
        }
        
    }
}
