
package web.designpattern.builder;

public class PizzaBuilderExample {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
		waiter.setPizzabuilder(spicy_pizzabuilder);
		waiter.constructPizza();
		
		Pizza pizza = waiter.getPizza();
		
		System.out.println("Generated pizza is : "+pizza.toString());
		
		
	}
}
