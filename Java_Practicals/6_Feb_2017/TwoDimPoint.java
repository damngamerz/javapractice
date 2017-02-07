public class TwoDimPoint
      {
         private double x, y, distanceFromOrigin;
         public TwoDimPoint ()
                    {
                       this.x = Math.random()*10;
                       this.y = Math.random()*10;
                       this.distanceFromOrigin = getDistanceFromOrigin ();
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
				   return "(" + x + ", " + y + ") \n Distance from origin = " + getDistanceFromOrigin ();
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
				   TwoDimPoint a = new TwoDimPoint ();
				   TwoDimPoint b = new TwoDimPoint ();
				   System.out.println (a);
				   System.out.println (b);
                   System.out.println ("Hashcode of a: " + a.hashCode ());
                   System.out.println ("Hashcode of b: " + b.hashCode ());
				   if (a.equals(b))
				     System.out.println ("a equals b");
				   else
				     System.out.println ("a does not equal b");
				   if (a == b)
				     System.out.println ("a == b");
				   else
				     System.out.println ("a != b");
				   a = b;
				   System.out.println ("After assigning b to a:");
				   if (a.equals(b))
				     System.out.println ("a equals b");
				   else
				     System.out.println ("a does not equal b");
				   if (a == b)
				     System.out.println ("a == b");
				   else
				     System.out.println ("a !== b");
                   System.out.println ("Hashcode of a: " + a.hashCode ());
                   System.out.println ("Hashcode of b: " + b.hashCode ());

			   }
      }
