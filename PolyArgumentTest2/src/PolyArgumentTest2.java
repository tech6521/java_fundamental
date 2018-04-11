class car {
	static int num = 10;
	String color;
	
	void supCar() {
		String	color = "red";
		
		System.out.println(color);
	}
}


public class PolyArgumentTest2 {
	public static void main(String[] args) {
		car c = new car();
		
		c.supCar();
		System.out.println(c.num);
		
	}
	
	
	
}
