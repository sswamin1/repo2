package web.designpattern.builder;

public class SpicyPizzaBuilder extends PizzaBuilder{

	public void buildSauce() {
		   pizza.setSauce("hot");
		}

		@Override
		public void buildDough() {
			pizza.setDough("pan-baked");
			
		}

		@Override
		public void buildTopping() {
			pizza.setTopping("Onion+Jalapeno");
			
		}
}
