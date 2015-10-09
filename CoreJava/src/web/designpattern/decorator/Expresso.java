package web.designpattern.decorator;

public class Expresso extends Beverage{

	public Expresso()
	{
		description="Expresso";
	}

	@Override
	public double getCost() {
		
		return 1.99;
	}
	
}
