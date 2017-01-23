import java.util.Random;
public class random{
	public static void main(String [] args){
	Random generator=new Random();
	int a[]=new int[10000];
	int duplicate=0;
	for(int i=0;i<a.length;i++){
	a[i]=generator.nextInt(10000);
	System.out.print(a[i]+"\t");
	}
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				a[i]=0;
				duplicate++;
			}
		}
	}
	for(int i=0;i<a.length;i++){
	System.out.print(a[i]+"\t");}
	System.out.println("No of Duplicates"+duplicate);
	}
	}
