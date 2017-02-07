public class Hours 
      {
         private int hours;
         public Hours ()
             {
               hours = 0;
             }
         public Hours (int h)
             {
                hours = h;
             }
         public String toString ()
             {
                return "Hours:" + hours;
             }
         /*public boolean equals (Object other)
             {
                if (this == null || other == null)
                  return false;
                if (this.getClass () != other.getClass ())
                  return false;
                Hours h = (Hours) other;
                if (h.hours != this.hours)
                  return false;
                return true;
             }*/
         public void doubleTheValue ()
              {
				  setHours (2 * this.hours);
			  }
         public void addTwo (Hours h)
             {
                this.setHours (this.hours + h.hours);
             }
         public int getHours ()
            {
				return this.hours;
			}
		 public void setHours (int h)
		    {
				this.hours = h;
			}
		 public static void main (String [] args)
		    {
				 Hours a = new Hours (10);
				 Hours b = new Hours (5);
				 System.out.println (a);
				 a.doubleTheValue ();
				 a.addTwo (b);
				 System.out.println (a);
			}
      }

