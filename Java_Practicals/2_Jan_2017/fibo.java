public class fibo {
	public static void main(String []args) {
	int next,a,b;
	a=0;b=1;
	System.out.println(a);
	System.out.println(b);
	for(int n=0;n<10;n++) {
		next=a+b;
		a=b;
		b=next;
		System.out.println(next);
		}	
		
	}

}
