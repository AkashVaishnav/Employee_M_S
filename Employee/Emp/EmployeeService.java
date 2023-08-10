package Emp;
import java.util.*;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<>();

    Employee emp1 = new Employee(101, "Shital", 24,"Developer", "IT", 25000);
    Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
    Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 5000);
    Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

    Scanner sc  = new Scanner(System.in);

    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double sal;

    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    //view all the employees
    public void viewAllEmps(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }
    //view emp based on there id
    public void viewEmp(){
        boolean found = false;
        System.out.print("Enter Id : ");
        id = sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId() == id){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee with this id is not present");
        }
    }

    //update the employee
    public void updateEmployee(){
        boolean found = false;
        System.out.print("Enter Id : ");
        id = sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId() == id){
                System.out.print("Enter Name : ");
                name = sc.next();
                System.out.print("Enter new salary : ");
                sal = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of employees are : ");
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details updated successfully !!");
        }
    }

    //delete the employeee
    public void deleteEmp(){
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for(Employee emp:empset){
            if(emp.getId() == id){
                empdelete = emp;
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    // add employee
    public void addEmp(){
        System.out.print("Enter id : ");
        id = sc.nextInt();
        System.out.print("Enter the name");
        name = sc.next();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter the DEsiganation : ");
        desiganation = sc.next();
        System.out.print("Enter the departemnt : ");
        department = sc.next();
        System.out.print("Enter the salary : ");
        sal = sc.nextInt();

        Employee emp = new Employee(id, name, age, desiganation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("New Employee added successfully!!");
    }
    public static void main(String[] args) {
        
    }
}