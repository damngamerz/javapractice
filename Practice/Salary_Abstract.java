public class Salary_Abstract extends Employee_Abstract{
  private double salary;

  public Salary_Abstract(String name,String address,int number,double salary) {
    super(name,address,number);
    setSalary(salary);
  }
  public void mailCheck() {
    System.out.println("Within mailCheck of Salary_Abstract class");
    System.out.println("Mailing check to "+getName()+"with salary"+salary);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double newSalary){
    if(newSalary>=0.0){
      salary=newSalary;
    }
  }
  public double computePay(){
    System.out.println("computing salary pay for"+getName());
    return salary/52;
  }
}
