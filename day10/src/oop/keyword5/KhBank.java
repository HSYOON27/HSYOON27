package oop.keyword5;

public class KhBank {
	

	//field = static / non-static
	
	private static double baseRate;//기본 이율
	static {
		//static 항목에 대한 초기화 코드를 작성할 수 있는 전용공간
		//ex : 1부터 100까지 더한 결과를 설정
		//if, for 등 각종 프로그래밍 구문 사용 가능 
		baseRate = 1.2;
	}
	public static double getBaseRate() {
		return baseRate;
	}
	public static void setBaseRate(double baseRate) {
		if(baseRate<0)
			return;
		KhBank.baseRate = baseRate;
	} //static
	
	private String name;
	private double advanceRate;
	private long balance; //꼭 int만 쓰지 안흠 잔액이 20억이 넘어간다면 long 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAdvanceRate() {
		return advanceRate;
	}
	public void setAdvanceRate(double advanceRate) {
		if(advanceRate<0)
			return;
		this.advanceRate = advanceRate;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		if(balance < 0)
			return;
		this.balance = balance;
	}
	//non-static
	
	public KhBank(String name, double advanceRate, long balance) {
		this.setName(name);
		this.setAdvanceRate(advanceRate);
		this.setBalance(balance);
	}
	
	public void output() {
		System.out.println("<계좌 정보>");
		System.out.println("소유자 " + this.getName());
		System.out.println("기본 이율 " + getBaseRate());
		System.out.println("우대 이율 " + this.getAdvanceRate());
		System.out.println("잔액 " + this.getBalance());
	}
	
	
}
