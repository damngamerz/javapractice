import java.util.Scanner;
public class Triangle {
	private double sideAB,sideBC,sideCA,
						angleA,angleB,angleC,
						area,perimeter;

	private static int countOfTriangle;
	
	public Triangle(){
	sideAB=sideBC=sideCA=10.0;
	angleA=getAngle(sideAB,sideCA,sideBC);
	angleB=getAngle(sideBC,sideAB,sideCA);
	angleC=getAngle(sideCA,sideBC,sideAB);
	area=getArea();
	perimeter=getPerimeter();
	}
	
	public Triangle(double a,double b,double c){
	this();
	if(isTriangle(a,b,c));
	{
		sideAB=c;sideBC=a;sideCA=b;
		angleA=getAngle(c,b,a);
		angleB=getAngle(a,c,b);
		angleC=getAngle(b,a,c);
		area=getArea();
		perimeter=getPerimeter();
	}
	}
	
	public double getArea() {
		double s = getPerimeter()/2;
		return Math.sqrt(s*(s-sideBC)*(s-sideCA)*(s-sideAB));
	}
	
	public double getPerimeter() {
		return sideAB+sideBC+sideCA;
	}
	
	public double getAngle(double a, double b, double c) {
		return Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
	}

	public boolean isTriangle(double a,double b,double c){
	return (a+b>c && b+c>a && c+a>b);
	}
	
	public void display(){
	System.out.println("SideAB="+sideAB);
	System.out.println("SideBC="+sideBC);
	System.out.println("SideCA="+sideCA);
	System.out.println("AngleA="+angleA);
	System.out.println("AngleB="+angleB);
	System.out.println("AngleC="+angleC);
	System.out.println("Area="+area);
	System.out.println("Perimeter="+perimeter);
	}
	
	public Triangle addTwo(Triangle x,Triangle y){
		double sum = x.perimeter+y.perimeter;
		double side = sum/3;
		return new Triangle(side,side,side);
	}
		
	public static void main(String args[])
	{
		double a,b,c;
		System.out.println("Enter the sides");
		Scanner sc= new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		Triangle custom = new Triangle(a,b,c);
		custom.display();
		Triangle def = new Triangle();
		def.display();
		Triangle sum = new Triangle();
		sum = custom.addTwo(custom,def);
		sum.display();
	}	
}
