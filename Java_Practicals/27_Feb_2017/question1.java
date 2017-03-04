import java.util.*;

public class question1 {
    public static void main(String[] args) {
        int evencount = 0;
        int oddcount= 0;
        int amteven = 0;
        int amtodd = 0;
        int largest = 0;
        int smallest =10;
        int input = 0;
        int temp = 0;
        System.out.println("Enter a series of numbers. Enter a negative number to quit.");

        Scanner scan = new Scanner(System.in);

        while ((input = scan.nextInt()) > 0) {
			if(input%2==0){
				evencount+=input;
				amteven++;
			}
			else
			{
				oddcount+=input;
				amtodd++;
			}
			if(input>largest)
			{
				largest=input;
			}
			if(input<smallest)
			{
				smallest=input;
			}	       
        }
        System.out.println("You entered "+amteven+" even no. Averaging:"+(evencount/amteven));
        System.out.println("You entered "+amtodd+" odd no. Averaging:"+(oddcount/amtodd));
        System.out.println("Largest no."+largest);
        System.out.println("Smallest no."+smallest);
    }
}
