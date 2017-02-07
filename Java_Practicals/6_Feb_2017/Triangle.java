public class Triangle extends TwoDimPoint{
	TwoDimPoint PointA,PointB,PointC;
	
	double SideAB,SideBC,SideCA;
	Triangle(){
	TwoDimPoint A= new TwoDimPoint();
	PointA=A;
	TwoDimPoint B= new TwoDimPoint();
	PointB=B;
	TwoDimPoint C= new TwoDimPoint();
	PointC=C;
	SideAB=A.getDistance(B);
	SideBC=B.getDistance(C);
	SideCA=C.getDistance(A);
	}
	public String toString ()
   {
		return "SideAB="+SideAB+"\nSideBC="+SideBC+"\nSideCA="+SideCA;
	}
	public static void main(String [] args){
	Triangle trian=new Triangle();
	System.out.println("PointA");
	System.out.println(trian.PointA);
	System.out.println("PointB");
	System.out.println(trian.PointB);
	System.out.println("PointC");
	System.out.println(trian.PointC);
	System.out.println(trian);
	
	}
}
