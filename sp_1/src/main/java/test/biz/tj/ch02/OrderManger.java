package test.biz.tj.ch02;

public class OrderManger {
	private CarMaker cm;
	
	public OrderManger(){
		this.cm = new SamSung();
	}
	
	public void order(){
		Car car = cm.sell(new Money(100));
	}
}
