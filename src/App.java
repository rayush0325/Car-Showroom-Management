import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/showroom";
    private static final String password = "123456";
    private static final String username = "root";
    ArrayList<Showroom> showrooms = new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }

    public void menu(){
        System.out.println("Welcome to our showroom");
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "1. Add Showroom\n" +
                "2. Get Showroom\n" +
                "3. Add Cars\n" +
                "4. Get Cars\n" +
                "5. Add Employee\n" +
                "6. Get Employee\n" +
                "0 to Exit\n" +
                "choose option[0...6]"
        );
        int option = scanner.nextInt();
        switch (option){
            case 0://Exit
                System.out.println("Bye");
                scanner.close();
                break;
            case 1://Add Showroom
                addShowroom();
                break;
            case 2://Get Showroom
                getShowroom();
                break;
            case 3://Add Cars

                break;
            case 4://Get Cars
                break;
            case 5://Add Employees
                addEmployee();
                break;
            case 6://Get Employess
                getEmployees();
                break;
        }
    }
    private void addShowroom(){
        showrooms.add(new Showroom());
        System.out.println("New Showroom Added");
        System.out.println(
                "choose option\n" +
                "1. Add showroom\n" +
                "2. Jump to Menu"
        );
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            addShowroom();
        }
        else menu();
    }
    private void getShowroom(){
        for (Showroom showroom : showrooms){
            System.out.println(
                    showroom.name+"\n" +
                    "Address "+showroom.address+"\n" +
                    "Manager Name "+showroom.managerName+"\n" +
                    "Total Employess "+showroom.totalEmployees+"\n"
            );
        }
        menu();
    }
    private void addEmployee(){
        Employee employee = new Employee();
        employees.add(employee);
        //add employee to a showroom
        for(Showroom showroom : showrooms){
            if(showroom.name.equals(employee.showroomName)){
                showroom.totalEmployees++;
            }
        }
        System.out.println("New Employee Added");
        System.out.println(
                "choose option\n" +
                "1. Add employee\n" +
                "2. Jump to Menu"
        );
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            addEmployee();
        }
        else menu();
    }
    private void getEmployees(){
        for(Employee employee : employees){
            System.out.println(
                    "Employee id : "+employee.employeeId+"\n" +
                    "Employee name : "+employee.name+"\n" +
                    "Employee age : "+employee.age+"\n" +
                    "Employee department : "+employee.department+"\n" +
                    "Employee showroom : "+employee.showroomName+"\n"
            );
        }
        menu();
    }
}
