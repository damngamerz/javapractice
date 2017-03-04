import java.util.*;
public class question2 {
 
        public static void main(String[] args) {
                 int day,month,year;
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the dd");
                 day=sc.nextInt();
                 System.out.println("Enter the mm");
                 month=sc.nextInt();
                 System.out.println("Enter the yy");
                 year=sc.nextInt();
                 int a [] ={31,28,31,30,31,30,31,31,30,31,30,31};
                 int i = 0;
                 int numofdays=0;
                 if(month<2){
                 	numofdays=day;
                 }
                 else{
                 	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        for(i=0;i<(month-1);i++)
                        {	if(i==1)
                        	numofdays+=29;
                        	else
                        	numofdays+=a[i];
                        }
                 	else
                        for(i=0;i<(month-1);i++)
                        {
                        	numofdays+=a[i];
                        }
                    numofdays+=day;
                 }
                 System.out.println("Num of days: "+numofdays);
        }
}
