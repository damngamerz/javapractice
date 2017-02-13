public class primary{
	void status(){
	System.out.println("This is primary school");
	}
}

class secondary extends primary{
	void status(){
	System.out.println("This is secondary school");
	}
}

class college extends secondary{
	void status(){
	System.out.println("This is college");
	}
}

class university extends college{
	void status(){
	System.out.println("This is university");
	}
}

class industry extends university{
	void status(){
	System.out.println("This is industry");
	}
}


