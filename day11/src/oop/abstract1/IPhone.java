package oop.abstract1;

public abstract class IPhone extends Mobile {

	public IPhone(String color) {
		super(color);
	} //이렇게 생성자만 만들어 주면 된다. 왜 ? 추상자니까
	
	public abstract void siri();

}
