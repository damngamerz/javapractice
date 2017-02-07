public class HoursMinutes extends Hours
      {
		  private int minutes;
		  public HoursMinutes ()
		      {
				  super ();
				  minutes = 0;
			  }
		  public HoursMinutes (int m)
		  	  {
		  		  minutes = m % 60;
		  		  setHours (m / 60);
			  }
		  public HoursMinutes (int h, int m)
		  	  {
				  super (h);
		  		  minutes = m;
			  }
		public String toString ()
		      {
				  return super.toString () + "\nMinutes:" + minutes;
			  }
		public void setMinutes (int m)
		      {
				  minutes = m;
			  }
	    public int getMinutes ()
	          {
				  return minutes;
			  }
	    public void doubleTheValue ()
	          {
				  int m = toMinutes () * 2;
				  setMinutes (m % 60);
				  setHours (m / 60);
			  }
		public int toMinutes ()
		      {
				  return (getHours () * 60 + getMinutes ());
			  }
		public static void main (String [] args)
		      {
				  Hours hm = new HoursMinutes (5, 59);
                  Hours h = new Hours (6);
                  System.out.println (hm);
                  System.out.println (h);
                  h.doubleTheValue ();
                  hm.doubleTheValue ();
                  System.out.println (hm);
                  System.out.println (h);

			  }
      }
