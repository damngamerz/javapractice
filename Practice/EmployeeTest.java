import java.io.*;
public class EmployeeTest {
  public static void main(String []args) {
    Employee emp1=new Employee("Saurav");
    Employee emp2 =new Employee("Akshay");

    emp1.empAge(20);
    emp1.empDesignation("Student");
    emp1.empSalary(10000);
    emp1.printEmployee();

    emp2.empAge(21);
    emp2.empDesignation("Student VC");
    emp2.empSalary(30000);
    emp2.printEmployee();

  }
}
