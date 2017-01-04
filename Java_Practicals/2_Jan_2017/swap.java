public class swap{
	public static void main (String []args) {
	int x,y;
	x=5;y=7;
	System.out.println("Value of x: "+ x);
	System.out.println("Value of y: "+ y);
	x=x+y;
	y=x-y;
	x=x-y;	
	System.out.println("Value of x after swap: "+ x);
	System.out.println("Value of y after swap: "+ y);
	}

}
