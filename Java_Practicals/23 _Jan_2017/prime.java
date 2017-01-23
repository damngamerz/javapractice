class prime
{
    public static void main(String []args)
    {
        int i,k,j,count=1,one=0,three=0,seven=0,nine=0;
        for(i=3;i<10000;i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0 || i%10==5)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {   switch(i%10){
						case 1:
							one++;
							break;
						case 3:
							three++;
							break;
						case 7:
							seven++;
							break;
						case 9:
							nine++;
							break;

						}
                System.out.print(i+"\t");
					 count++;
            }
        }
			System.out.println("\nTotal prime no:"+count);
			if(one>=three && one>= seven && one >= nine)
				System.out.println("\n No of 1's is Highest:"+one);
			else if(three>=seven && three>=nine)
				System.out.println("\n No of 3's is Highest:"+three);
			else if(seven>=nine)
				System.out.println("\n No of 7's is Highest:"+seven);
			else
				System.out.println("\n No of 9's is Highest:"+nine);
    }
}
