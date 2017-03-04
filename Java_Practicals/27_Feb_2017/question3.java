import java.util.Scanner;
 
public class question3
{
    public static void main(String args[])
    {
        int oct, dec=0, i=0,temp=0,check=0,digit=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Octal Number : ");
        oct = scan.nextInt();
        temp= oct;
        int length= String.valueOf(oct).length();

   
        while(oct != 0)
        {   if(oct%10<8)
        	{
            dec = dec + (oct%10) * (int) Math.pow(8, i);
            i++;
            oct = oct/10;
            }
            else{
            System.out.println("Not valid");
            check=1;
            break;
            
            }
        }
        if(check==0){
        System.out.println("Equivalent Decimal Value of " + oct + " is :\n");
        System.out.println(dec);}
        
        
    }
}
