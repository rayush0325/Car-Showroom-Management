import java.util.Scanner;

public class Showroom {
    String name;
    String address;
    String managerName;
    int totalEmployees = 0;
    Showroom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Showroom name");
        this.name = scanner.nextLine();
        System.out.println("Enter Showroom address");
        this.address = scanner.nextLine();
        System.out.println("Enter manager name");
        this.managerName = scanner.nextLine();
    }
}
