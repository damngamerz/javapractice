class Outer_Demo {
  private int num = 175;

  public class Inner_Demo{
    public int getNum(){
      System.out.println("This is getNum method of inner class");
      return num;
    }
  }
}

public class My_class2 {

  public static void main(String []args){
    Outer_Demo outer=new Outer_Demo();

    Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
    System.out.println(inner.getNum());
  }
}
