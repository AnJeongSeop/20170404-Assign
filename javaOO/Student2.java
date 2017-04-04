public class Student {
	private String Stu;
	private int StuNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student m = new Student();
		m.setMe("컴퓨터 정보학과", 20141649);
		System.out.println("학과 = " + m.getStu());
		System.out.println("학번 = " + m.getStuNum());
	}
	String getStu(){
		return Stu;
	}
	int getStuNum(){		
		return StuNum;
	}
	void setMe(String a,int b){
		Stu = a;
		StuNum = b;
	}	
}
