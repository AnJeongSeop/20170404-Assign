public class Account {
	private String owner;
	private long balance;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account money = new Account(); 
		money.setbalance(100000); //현재 잔고
		money.deposit(100000); //10만원입금
		money.withdraw(50000); //5만원 출금
		money.withdraw(50000); //5만원 출금
		money.deposit(70000); //7만원 입금
		money.withdraw(40000); //4만원 출금
	}
	//생성자 생성
	public Account(){		
	}
	public Account(String owner){
		this.owner = owner;
	}
	public Account(long balance){
		this.balance = balance;
	}
	public Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	//get
	public String getowner(){		
		return owner;
	}
	public void setowner(String owner){
		this.owner = owner;
	}
	public long getbalance(){		
		return balance;
	}
	public void setbalance(long balance){		
		this.balance = balance;
	}
	public long deposit(long amount){ //저축
		long bal = this.balance + amount;
		this.balance = bal;
		System.out.println(amount + "원 입금 \n" + "현재 잔고 : " + bal );
		return bal;
	}
	public long withdraw(long amount){ //인출
		long bal = this.balance - amount;
		this.balance = bal;
		System.out.println(amount + "원 출금 \n" + "현재 잔고 : " + bal );
		return bal;
	}

}
