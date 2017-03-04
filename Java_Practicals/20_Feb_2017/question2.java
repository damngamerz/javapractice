public class question2{
	public static void main(String []args)
	{
	shape2 r=new rectangle(10,20);
	r.perimeter();
	r.area();
	shape2 t=new triangle(10,10,5,6);
	t.perimeter();
	t.area();
	shape2 c=new circle(10);
	c.perimeter();
	c.area();
	}	






}

interface shape1
{
	public void perimeter();
}

interface shape2 extends shape1
{
	public void area();
}

 class rectangle implements shape2
 {
 	int a;
 	int b;
 	rectangle(int a,int b)
 	{
 	this.a=a;
 	this.b=b;
 	
 	}
    public void perimeter()
	{
	    System.out.println("The perimeter of rectangle:"+(2*(a+b)));
	}
    public void area()
	{
	    System.out.println("The area of rectangle:"+(a*b));
	}   
 }
  class triangle implements shape2
 {
 	int sideAB,sideBC,sideCA,base,height;
 	triangle(int sideAB,int sideBC,int sideCA,int height) 	
 	{
 	this.sideAB=sideAB;
 	this.sideBC=sideBC;
 	this.sideCA=sideCA;
 	this.base=sideBC;
 	this.height=height;
 	}
    public void perimeter()
	{
	    System.out.println("The perimeter of Triangle:"+(sideAB+sideBC+sideCA));
	}
    public void area()
	{
	    System.out.println("The area of Triangle:"+(0.5*base*height));    
	}   
 }
  class circle implements shape2
 {
    int r;
    circle(int r)
    {
    this.r=r;
    }
    public void perimeter()
	{
		System.out.println("The perimeter of circle:"+(2*Math.PI*r));     
	}
    public void area()
	{
	    System.out.println("The area of circle"+(Math.PI*r*r));
	}   
 }
