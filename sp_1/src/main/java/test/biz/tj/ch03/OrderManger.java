package test.biz.tj.ch03;

public class OrderManger {
	private CarMaker cm;
	
	public OrderManger(){}
	
	public void order(){
		Car car = cm.sell(new Money(100));
	}
	
	public void setMaker(CarMaker cm){
		this.cm= cm;
	}
}
