public class Puppy1 {
  int puppyAge;
  public Puppy1(String name) {
    System.out.println("Puppy's name is:"+name);
  }
  public void setAge(int age) {
    puppyAge=age;
  }
  public int getAge() {
    System.out.println("Puppy's age:"+puppyAge);
    return puppyAge;
  }
  public static void main(String []args) {
    Puppy1 mypuppy=new Puppy1("Tommy");
    mypuppy.setAge(12);
    mypuppy.getAge();
    System.out.println("Variable Passed:"+mypuppy.getAge());
  }
}
