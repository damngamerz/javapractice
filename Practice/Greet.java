interface Message {
  String greet();
}

public class Greet{

  public void displayMessage(Message m){
    System.out.println(m.greet()+" , This is an example of anonymous inner class as an argument");
  }
  public static void main (String[] args){
    Greet obj = new Greet();

    obj.displayMessage(new Message(){
      public String greet(){
        return "Hello";
      }
    });

  }
}
