class point {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}


class point3D extends point {
	int z;
	
	point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override // 컴파일러에게 알려주는 주체
	String getLocation() {
		//return "x : " + x + ", y : " + y + ", z : " + z;
		return super.getLocation() + ", z : " + z;
	}
}



public class Point3DTest {
	public static void main(String[] args) {
		point3D p = new point3D(100, 400, 50);
		System.out.println(p.getLocation());
	}
}
