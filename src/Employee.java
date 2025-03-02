import java.util.Scanner;
import java.util.UUID;

public class Employee {
    String employeeId;
    String name;
    int age;
    String department;
    String showroomName;
    Employee(){
        this.employeeId = UUID.randomUUID().toString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        this.name = scanner.nextLine();
        System.out.println("Enter employee age");
        this.age = scanner.nextInt();
        System.out.println("Enter employee department");
        this.department = scanner.next();
        System.out.println("Enter showroom name");
        this.showroomName = scanner.next();
    }

}
