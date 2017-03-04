import java.util.Scanner;
public class question3
{	public static void main(String []args){
	Bank b=new Bank();
	b.initialize();
	b.si();
	b.ci();
	}
}

interface EducationLoan
{
	public void si();
}

interface CarLoan
{
	public void ci();
}

class Bank implements EducationLoan,CarLoan
{	double p,r,t,n;
	public void initialize()
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle amount:");
	p=sc.nextDouble();
	System.out.println("Enter the rate of interest:");
	r=sc.nextDouble();
	System.out.println("Enter the Time in years");
	t=sc.nextDouble();
	System.out.println("How many times amount is compounded annually:");
	n=sc.nextDouble();			
	}
	public void si()
	{	
		double s=(p*r*t)/100;
		System.out.println("simple interest:"+s);
	}
	public void ci()
	{
		double c=p*Math.pow((1+r*n),(n*t))-p;
		System.out.println("Compound Interest:"+c);
	}
}

