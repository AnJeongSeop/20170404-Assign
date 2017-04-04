public class SalaryMan {
	int salary = 1000000; //초기값
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan m = new SalaryMan();
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}
	//기본생성자
	public SalaryMan(){
		
	}
	//정수형 생성자
	public SalaryMan(int salary){
		this.salary = salary;
	}
	int getAnnualGross(){
		return (salary + (salary*5));
	}
}
