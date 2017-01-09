class TimeInterval
     {
		  int hours, minutes, seconds;
		  TimeInterval (int hh, int mm, int ss)
		    {
				hours = hh;
				minutes = mm;
				seconds = ss;
			}
		  TimeInterval (int hh, int mm)
		    {
				hours = hh;
				minutes = mm;
				seconds = 0;
			}
		  TimeInterval (int ss)
		    {
				hours = ss / 60 / 60;
				minutes = ss / 60 % 60;
				seconds = ss % 60;
			}
		  TimeInterval ()
		    {
				hours = 0;
				minutes = 0;
				seconds = 0;
			}
          TimeInterval getSumOf (TimeInterval t1, TimeInterval t2)
            {
				int h = 0, m = 0, s = 0;
				s = t1.seconds + t2.seconds;
				if (s >= 60)
				  {
					  s -= 60;
					  m = 1;
			      }
			    m += t1.minutes + t2.minutes;
				if (m >= 60)
				  {
					  m -= 60;
					  h = 1;
			      }
			    h += t1.hours + t2.hours;
			    return new TimeInterval (h, m, s);
			}
          TimeInterval getDifferenceOf (TimeInterval t1, TimeInterval t2)
            {
				int s1 = t1.hours * 3600 + t1.minutes * 60 + t1.seconds;
				int s2 = t2.hours * 3600 + t2.minutes * 60 + t2.seconds;
				int difference = s1 - s2 > 0 ? s1 - s2 : s2 - s1;
			    return new TimeInterval (difference);
			}
		  void display ()
		     {
				 System.out.println (hours + ":" + (minutes < 10 ? "0" + minutes : "" + minutes) + ":" + (seconds < 10 ? "0" + seconds : "" + seconds));
		     }
			public static void main(String []args) {
				TimeInterval t1=new TimeInterval(1,40);
				t1.display();
				TimeInterval t2=new TimeInterval(1,30);
				t2.display();
				TimeInterval t3=new TimeInterval();
				t3=t1.getSumOf(t1,t2);
				t3.display();
				TimeInterval t4=new TimeInterval(1,40,50);
				t4.display();
				TimeInterval t5=new TimeInterval(1,30,10);
				t5.display();
				TimeInterval t6=new TimeInterval();
				t6=t4.getDifferenceOf(t4,t5);
				t6.display();				
				TimeInterval t7=new TimeInterval(4000);
				t7.display();
				TimeInterval t8=new TimeInterval(500);
				t8.display();
				TimeInterval t9=new TimeInterval();
				t9=t7.getDifferenceOf(t7,t8);
				t9.display();			
			}
     }
