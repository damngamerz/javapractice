public class TwoDimPoint
      {
         private double x, y, distanceFromOrigin;
         public TwoDimPoint (double x, double y)
                    {
                       this.x = x;
                       this.y = y;
                       this.distanceFromOrigin = getDistanceFromOrigin ();
                    }
         public TwoDimPoint (double x)
                    {
                       this.x = this.y = x;
                       this.distanceFromOrigin = getDistanceFromOrigin ();
                    }
         public TwoDimPoint ()
                    {
                       this.x = this.y = this.distanceFromOrigin = 0.0;
                    }
         public double getDistanceFromOrigin ()
               {
                   return Math.sqrt (this.x * this.x + this.y * this.y);
               }
         public double getDistance (TwoDimPoint a, TwoDimPoint b)
               {
                   return Math.sqrt ((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
               }
         public double getDistance (TwoDimPoint a)
               {
                   return Math.sqrt ((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y));
               }
         public String toString ()
               {
				   return "(" + x + ", " + y + "), distance from origin = " + getDistanceFromOrigin ();
			   }
		 public void setX (double x)
		       {
				   this.x = x;
			   }
		 public void setY (double y)
		       {
				   this.y = y;
			   }
		 public double getX ()
		       {
				   return x;
			   }
		 public double getY ()
		       {
				   return y;
			   }
		 public void moveTo (TwoDimPoint other)
		       {
				   this.x = other.x;
				   this.y = other.y;
			   }
	     public void moveTo (double x, double y)
	           {
				   this.x = x;
				   this.y = y;
			   }
		 public void moveBy (double deltaX, double deltaY)
		       {
				   this.x += deltaX;
				   this.y += deltaY;
			   }
		 public void changeXBy (double deltaX)
		       {
				   this.x += deltaX;
			   }
		 public void changeYBy (double deltaY)
		       {
				   this.y += deltaY;
			   }
	     public boolean equals (Object other)
	           {
				   TwoDimPoint o;
				   if (other instanceof TwoDimPoint)
				     {
				       o = (TwoDimPoint) other;
				       if (this == null || o == null)
				          return false;
				     }
				   else
				     return false;
				   return (this.x == o.x && this.y == o.y);
			   }
		 public int hashCode ()
		       {
				   return System.identityHashCode (this);
			   }
	     public static void main (String [] args)
	           
		{
			TwoDimPoint s1=new TwoDimPoint(3,2);
			System.out.print(s1+"\n");
			TwoDimPoint a=new TwoDimPoint(4,4);
			System.out.print(a+"\n");
			TwoDimPoint b=new TwoDimPoint(4,4);
			System.out.print(b+"\n");
			if(a.equals(b)){
			System.out.println("a and b are equal");
			}		
		}
      }
