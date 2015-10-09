package web.designpattern.decorator;

public class Milk extends CondimentDecorator{
Beverage beverage;
	
	public Milk(Beverage beverage) {	
	this.beverage = beverage;
}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" Milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost()+0.30;
	}

	
}
