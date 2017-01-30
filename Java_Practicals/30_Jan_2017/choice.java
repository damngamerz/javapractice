import java.util.Scanner;
import java.lang.Math;
public class choice{
	static int max(int A,int B)
	{
	if(A>B)
	return A;
	else
	return B;
	}
	static int min(int A,int B)
	{
	if(A<B)
	return A;
	else
	return B;
	}
	public static void main(String []args){
		int rest=0;
		while(rest==0){
		System.out.println("\nEnter your Choice:");
		System.out.println("1.For Squaring");
		System.out.println("2.For Log");
		System.out.println("3.For Power");
		System.out.println("4.For Maximum of 2 num");
		System.out.println("5.For Minimum of 2 num");
		System.out.println("6.For Area");
		System.out.println("7.For Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.print("Choice Entered:"+choice);
		switch(choice){
			case 1:
			System.out.println("\nEnter a number");
			int number=sc.nextInt();
			number=number*number;
			System.out.println("\nSquared number:"+number);
			break;
			
			case 2:
			System.out.println("\nEnter a number");
			number=sc.nextInt();
			System.out.println("\nLog:"+Math.log(number));
			break;
			
			case 3:
			System.out.println("\nEnter a number");
			number=sc.nextInt();
			System.out.println("\nEnter a power");
			int power=sc.nextInt();
			
			System.out.println("\nResult:"+Math.pow(number,power));
			break;
			
			case 4:
			System.out.println("\nEnter a number");
			int A=sc.nextInt();
			System.out.println("\nEnter a number");
			int B=sc.nextInt();
			System.out.println("\nMax is:"+max(A,B));
			break;
			
			case 5:
			System.out.println("\nEnter a number");
			A=sc.nextInt();
			System.out.println("\nEnter a number");
			B=sc.nextInt();
			System.out.println("\nMin is:"+min(A,B));
			break;
			
			case 6:
			System.out.println("\nEnter radius");
			int r=sc.nextInt();
			System.out.println("\nArea:"+Math.PI*r*r);
			break;
			
			case 7:
			rest=1;
			break;
			
			
			default:
			System.out.println("Entered Wrong Value");	
		}
		}
	}
}
