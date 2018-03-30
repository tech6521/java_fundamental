class MyMath3 {
	long a, b;
	
	long add() { return a+b;}
	long subtract() { return a-b;}
	long multiply() { return a*b;}
	double divide() { return a/b;}
	
	static long add(long a, long b) {
		return a+b;
	}
	
	static long subtract(long a, long b) {
		return a-b;
	}
	
	static long multiply(long a, long b) {
		return a*b;
	}
	
	static double divide(long a, long b) {
		return a/b;
	}
}
class MyMath2 {
	public static void main(String[] args) {
		System.out.println(MyMath3.add(200L, 100L));
		
		MyMath3 mm = new MyMath3();
	}

}
