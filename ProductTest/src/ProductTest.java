class product {
	static int count = 0;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	
	public product() {}
}


public class ProductTest {
	public static void main(String[] args) {
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		
		
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		
		System.out.println(product.count);
	}
	

}
