import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CrudDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Collection<Employee> collection = new ArrayList<>();

        int choice;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 ->{
                    System.out.print("Enter the employee Id no: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter the employee name: ");
                    String employeeName = scanner.nextLine();

                    System.out.print("Enter the employee salary: ");
                    double employeeSalary = scanner.nextDouble();
                    scanner.nextLine();

                    collection.add(new Employee(employeeId, employeeName, employeeSalary));

                }

                case 2 -> {
                    System.out.println("********************************");
                    System.out.println(collection);
                    System.out.println("********************************");
                }

            }

        }while (choice != 0);



        scanner.close();

    }

}
