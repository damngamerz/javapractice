class Rectangle
     {
        double length,
               width,
               area,
               perimeter,
               diagonal;

        Rectangle ()
              {
				  length = 10;
				  width = 10;
				  perimeter = getPerimeter ();
				  area = getArea ();
				  diagonal = getDiagonal ();
			  }
        Rectangle addTwo (Rectangle r1, Rectangle r2)
              {
				 double side = Math.sqrt (r1.area + r2.getArea ());
				 return new Rectangle (side);
			  }
        Rectangle addTwo (Rectangle r1)
              {
				  double length = this.length + r1.length;
				  double width = this.width + r1.width;
				  return new Rectangle (length, width);
			  }

        Rectangle (double l)
              {
				  length = l;
				  width = l;
				  perimeter = getPerimeter ();
				  area = getArea ();
				  diagonal = getDiagonal ();
			  }
        Rectangle (double l, double w)
              {
				  length = l;
				  width = w;
				  perimeter = getPerimeter ();
				  area = getArea ();
				  diagonal = getDiagonal ();
			  }
        double getLength ()
              {
                 return length;
              }
         double getWidth ()
              {
                 return width;
              }
        double getArea ()
              {
                 return length * width;
              }
        double getPerimeter ()
              {
                 return 2 * (length + width);
              }
        double getDiagonal ()
              {
                 return Math.sqrt (length * length + width * width);
              }
        void display ()
            {
				System.out.println
					("Length = " + this.length +
					", width = " + width +
					", perimeter = " + perimeter +
					", area = " + area +
					", diagonal = " + diagonal
					);
			}
		public static void main(String []args){
		Rectangle s1=new Rectangle();		
		s1.display();
		Rectangle s2=new Rectangle(50.0);
		s2.display();
		Rectangle s3=new Rectangle(40.0,20.0);
		s3.display();	
		Rectangle s4=new Rectangle();
		s4=s1.addTwo(s1,s2);
		s4.display();
		Rectangle s5=new Rectangle();
		s5=s5.addTwo(s3);	
		s5.display();

		}
     }
