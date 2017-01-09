class ClockTime
     {
		 int hours, minutes, seconds;
		 void oneSecondAfter()
		     {
				 seconds ++;
				 if (seconds == 60)
				   {
					   seconds = 0;
					   minutes ++;
					   if (minutes == 60)
					     {
							 minutes = 0;
							 hours ++;
							 if (hours >= 24)
							   hours -= 24;
						 }
				   }

			 }
	     void oneSecondBefore()
	         {
				 seconds --;
				 if (seconds == -1)
				   {
					   seconds = 59;
					   minutes --;
					   if (minutes == -1)
					     {
							 minutes = 59;
							 hours --;
							 if (hours == -1)
							   hours = 23;
					     }
				  }
			 }
		 void display()
		      {
				  System.out.println ("The time is: " + hours + ":" + (minutes < 10 ? "0" + minutes : "" + minutes) + ":" + (seconds < 10 ? "0" + seconds : "" + seconds));
			  }
		 ClockTime (int hh, int mm, int ss)
		    {
				hours = hh;
				minutes = mm;
				seconds = ss;
			}
		 ClockTime (int ss)
		    {
				hours = ss / 60 / 60;
				minutes = ss / 60 % 60;
				seconds = ss % 60;
				while (hours >= 24)
				  hours -= 24;
			}
		 ClockTime (int hh, int mm)
		    {
				hours = hh;
				minutes = mm;
				seconds = 0;
			}
		 ClockTime ()
		    {
				hours = 0;
				minutes = 0;
				seconds = 0;
			}
		ClockTime addTimeInterval (TimeInterval t)
		   {
			   int hours = 0, minutes = 0, seconds = 0;
			   seconds = this.seconds + t.seconds;
			   if (seconds >= 60)
			     {
					 seconds -= 60;
					 minutes ++;
				 }
			   minutes += this.minutes + t.minutes;
			   if (minutes >= 60)
			     {
					 minutes -= 60;
					 hours ++;
				 }
			   hours += this.hours + t.hours;
			   while (hours >= 24)
			     hours -= 24;
            return new ClockTime (hours, minutes, seconds);
		   }
		public static void main(String []args){
			ClockTime s1=new ClockTime(1,40,20);
			s1.display();
			
			s1.oneSecondAfter();
			s1.display();
			s1.oneSecondBefore();
			s1.display();
     }
}
