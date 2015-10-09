package web.designpattern.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildSauce() {
	   pizza.setDough("mild");
	}

	@Override
	public void buildDough() {
		pizza.setDough("cross");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pinapple");
		
	}

}
