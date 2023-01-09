package oop.modifier4;

//class Car { 다른 패키지에서는 사용 불가 }
public class Car { //다른 클래스에서 사용 가능
	
	private String name;
	private int price;
	
	//setter, getter 메소드는 일반적으로 public으로 만들어야 한다.
	public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name; //this.name 인데 빠져있음 
	}
    public void setPrice(int price) {
		this.price = price;
	}
    public int getPrice() {
		return price;
	}
    public Car(String name, int price){
    	this.setName(name);
    	this.setPrice(price);
    }
    public void output() {
    	System.out.println(this.getName());
    	System.out.println(this.getPrice());
    }
}
