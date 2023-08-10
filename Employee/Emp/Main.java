package Emp;
import java.util.*;

public class Main {

    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu(){
        System.out.println("\n************* Welcome To Employee Management System ***************");
        System.out.println("\n1. Add Employee"
                        +  "\n2. View Employee"
                        +  "\n3. Update Employee"
                        +  "\n4. Delete the Employee"
                        +  "\n5. View all Employee"
                        +  "\n6. Exist");
                        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        do{
            menu();
            System.out.print("Enter Your Choice = ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : 
                            System.out.println("Add Employee");
                            service.addEmp();
                            break;
                case 2 : 
                            System.out.println("View Employee");
                            service.viewEmp();
                            break;
                case 3 : 
                            System.out.println("Update Employee");
                            service.updateEmployee();
                            break;
                case 4 : 
                            System.out.println("Delete The Employee");
                            service.deleteEmp();
                            break;
                case 5 : 
                            System.out.println("View All Employee");
                            service.viewAllEmps();
                            break;
                case 6 : 
                            System.out.println("Thank You for using application");
                            System.exit(0);
                default : 
                            System.out.println("Please enteer the valid choice");
                            break;
            }
        }while(ordering);
    }
}