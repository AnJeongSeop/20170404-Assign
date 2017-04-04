public class Circle {
  public double radius;
	public static double PI = 3.141592;
	
	//생성자 구현
	public Circle(double radius){
		this.radius = radius;
	}
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
	}
}
class Cylinder {
	Circle circle = new Circle(2.8);	
	double height;
	public Cylinder(double height){
		this.height = height;
	}
	double getVolume(){		
		double Volume = circle.getArea() * height;
		return Volume;
	}
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(5.6);
		System.out.println("원통의 부피 = " + cylinder.getVolume());
	}
}
