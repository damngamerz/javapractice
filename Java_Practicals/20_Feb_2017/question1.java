public class question1
{
    public static void main(String[] args)
	{
         
          shape rectangleshape=new rectangle ();
           
             rectangleshape.Draw();
          shape triangleshape=new triangle ();
           
             triangleshape.Draw();
          shape circleshape=new circle ();
           
             circleshape.Draw();
    }
}
 
interface shape
 {
     public String baseclass="shape";
      
     public void Draw();     
      
 }

 class rectangle implements shape
 {
 
    public void Draw()
	{
	        System.out.println("Drawing rectangle");
	}   
 }
  class triangle implements shape
 {
 
    public void Draw()
	{
	        System.out.println("Drawing triangle");
	}   
 }
  class circle implements shape
 {
 
    public void Draw()
	{
	        System.out.println("Drawing circle");
	}   
 }
