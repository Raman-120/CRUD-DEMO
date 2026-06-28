import java.util.*;

public class CrudDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Employee> collection = new ArrayList<>();
        Iterator<Employee> i;
        Employee e;

        int choice;
        int employeeId;
        double employeeSalary;
        String employeeName;


        do {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 ->{
                    System.out.print("Enter the employee Id no: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.nextLine();

                    System.out.print("Enter the employee salary: ");
                    employeeSalary = scanner.nextDouble();
                    scanner.nextLine();

                    collection.add(new Employee(employeeId, employeeName, employeeSalary));

                }

                case 2 -> {
                    System.out.println("********************************");
                    i = collection.iterator();
                    while (i.hasNext()){
                        e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("********************************");
                }

                case 3 -> {

                    System.out.print("Enter the employeeId number to search: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    System.out.println("********************************");
                    i = collection.iterator();
                    while (i.hasNext()){
                        e = i.next();
                        if(e.getEmployeeId() == employeeId){
                            System.out.println(e);
                            found = true;
                            break;
                        }
                    }
                    System.out.println("********************************");

                    if(!found){
                        System.out.println("Record not found.");
                    }

                }

                case 4 -> {
                    System.out.print("Enter employeeID to delete the record: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    i = collection.iterator();
                    while (i.hasNext()){
                        e = i.next();
                        if(e.getEmployeeId() == employeeId){
                            i.remove();
                            found = true;
                            break;
                        }
                    }


                    if(!found){
                        System.out.println("Record not found!");
                    }
                    else{
                        System.out.println("Record deleted successfully.");
                    }
                }

                case 5 ->{
                    System.out.print("Enter the employee Id to update the record: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    ListIterator<Employee> list = collection.listIterator();
                    while (list.hasNext()){
                        e = list.next();
                        if(e.getEmployeeId() == employeeId){
                            System.out.print("Enter new name: ");
                            employeeName = scanner.nextLine();

                            System.out.print("Enter new salary: ");
                            employeeSalary = scanner.nextDouble();
                            scanner.nextLine();
                            found = true;

                            list.set(new Employee(employeeId, employeeName, employeeSalary));
                        }
                    }
                    if(!found){
                        System.out.println("Record not found.");
                    }
                    else{
                        System.out.println("Record updated successfully.");
                    }

                }
            }

        }while (choice != 6);



        scanner.close();

    }

}
