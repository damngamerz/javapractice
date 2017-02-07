public class HoursMinutesSeconds extends HoursMinutes{
	private int seconds;
	public HoursMinutesSeconds ()
		      {
				  super ();
				  seconds = 0;
			  }
		  public HoursMinutesSeconds (int s)
		  	  {
		  		  super(s/60);
		  		  seconds = s % 60;
		  		  
			  }
		  public HoursMinutesSeconds (int h, int m, int s)
		  	  {
				  super (h,m);
		  		  seconds = s;
			  }
		public String toString ()
		      {
				  return super.toString () + "\nSeconds:" + seconds;
			  }
		public void setSeconds (int s)
		      {
				  seconds = s;
			  }
	    public int getSeconds ()
	          {
				  return seconds;
			  }
	    public void doubleTheValue ()
	          {
				  int s = toSeconds () * 2;
				  setSeconds (s%60);
				  int m = s/60;
				  setMinutes (m%60);
				  setHours (m/60);
			  }
		public int toSeconds ()
		      {
				  return (getHours () * 60 *60 + getMinutes ()*60+ getSeconds());
			  }
		public static void main(String args[]){
			Hours hm=new HoursMinutesSeconds(7200);
			System.out.println("Original Time");
			System.out.println(hm);
			hm.doubleTheValue();
			System.out.println("After Doubling");
			System.out.println(hm);
		}
}
