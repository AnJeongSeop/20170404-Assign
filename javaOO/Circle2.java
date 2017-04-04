public class Cylinder {
	Circle circle;
	double height;

	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}

	double getVolume() {
		double Volume = circle.getArea() * height;
		return Volume;
	}

	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("원통의 부피 = " + cd.getVolume());
	}
}
