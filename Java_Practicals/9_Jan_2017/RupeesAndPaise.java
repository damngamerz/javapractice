class RupeesAndPaise
     {
		 int rupees, paise;
		 RupeesAndPaise ()
		   {
			   rupees = paise = 0;
		   }
		 RupeesAndPaise (int rupees, int paise)
		   {
			   this.rupees = rupees;
			   this.paise = paise;
		   }
		 RupeesAndPaise (int paise)
		   {
			   this.rupees = paise / 100;
			   this.paise = paise % 100;
		   }
		 void display ()
		    {
				System.out.println (rupees + "." + paise);
			}
		 RupeesAndPaise addTwo (RupeesAndPaise x, RupeesAndPaise y)
		    {
				int rupees = 0, paise = 0;
				paise = x.paise + y.paise;
				if (paise >= 100)
				  {
					  rupees += 1;
					  paise -= 100;
				  }
				rupees += x.rupees + y.rupees;
				return new RupeesAndPaise (rupees, paise);
			}
		 RupeesAndPaise addTwo (RupeesAndPaise x)
		    {
				int rupees = 0, paise = 0;
				paise = x.paise + this.paise;
				if (paise >= 100)
				  {
					  rupees += 1;
					  paise -= 100;
				  }
				rupees += x.rupees + this.rupees;
				return new RupeesAndPaise (rupees, paise);
			}
		public static void main(String []args){
				RupeesAndPaise s1=new RupeesAndPaise(20,50);
				s1.display();
				RupeesAndPaise s2=new RupeesAndPaise(180);
				s2.display();
				RupeesAndPaise s3=new RupeesAndPaise();
				s3=s1.addTwo(s1,s2);
				System.out.println("After Addition");
				s3.display();							
			}

     }
