public class AbstractDemo {
  public static void main(String []args) {
    Salary_Abstract s = new Salary_Abstract("Saurav S.","Mumbai, MH",3,3600.00);
    Employee_Abstract e = new Salary_Abstract("John adams","Boston,MA",2,2400.00);
    System.out.println("Call mailCheck using Salary_Abstract ref--");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee ref--");
    e.mailCheck();
  }
}
