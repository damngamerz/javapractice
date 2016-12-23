import java.io.*;
public class Employee {
  String name;
  int age;
  String designation;
  double salary;
  public Employee(String name) {
    this.name=name;
  }
  public void empAge(int empAge) {
    age=empAge;
  }
  public void empDesignation(String empDesignation) {
    designation=empDesignation;
  }
  public void empSalary(double empSalary) {
    salary=empSalary;
  }
  public void printEmployee() {
    System.out.println("Employee name:"+name);
    System.out.println("Employee age:"+age);
    System.out.println("Employee designation:"+designation);
    System.out.println("Employee salary:"+salary);
  }
}