import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        WRM wr = new WRM();
        wr.registerPatient(1, "Abir", 5, "Ab");
        wr.registerPatient(1, "Afreen", 5, "Ab");
        wr.registerPatient(1, "Dip", 5, "Ab");
        wr.reverseTheLine();
        wr.showAllPatient();
        // Scanner sc = new Scanner(System.in);
        
        // while (true) {
        //     System.out.println("==Choose an option:==");
        //     System.out.println("1. RegisterPatient()");
        //     System.out.println("2. Serve Patient()");
        //     System.out.println("3. Cancel All()");
        //     System.out.println("4. CanDoctorGoHome()");
        //     System.out.println("5. ShowAllPatient()");
        //     System.out.println("6. Exit()");
        //     System.out.print("Enter your choice: ");
        //     int op = sc.nextInt();
        //     switch (op) {
        //         case 1:
        //             System.out.print("Enter ID: ");
        //             int id = sc.nextInt();
        //             System.out.print("Enter Name: ");
        //             String name = sc.next();
        //             System.out.print("Enter Age: ");
        //             int age = sc.nextInt();
        //             System.out.print("Enter Blood Group: ");
        //             String bg = sc.next();
        //             wr.registerPatient(id, name, age, bg);
        //             break;
        //         case 2:
        //             wr.servePatient();
        //             break;
        //         case 3:
        //             wr.cancelAll();
        //             break;
        //         case 4:
        //             wr.canDoctorGoHome();
        //             break;
        //         case 5:
        //             wr.showAllPatient();
        //             break;
        //         case 6:
        //             System.out.println("Thans for using WRM System.");
        //             return;
        //         default:
        //             break;
        //     }
        // }
        
    }
}
