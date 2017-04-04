public class Cylinder {
	double radius;
	Circle circle = new Circle(radius);	
	double height;
	
	double getVolume(){		
		double Volume = circle.getArea() * height;
		return Volume;
	}
	void setVolume(double radius, double height){
		circle.radius = radius;
		this.height = height;
	}
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setVolume(2.8, 5.6);
		System.out.println("원통의 부피 = " + c.getVolume());
	}
}
