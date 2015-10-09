package web.designpattern.builder;

public class Waiter {

	PizzaBuilder pizzabuilder;

	public PizzaBuilder getPizzabuilder() {
		return pizzabuilder;
	}

	public void setPizzabuilder(PizzaBuilder pizzabuilder) {
		this.pizzabuilder = pizzabuilder;
	}
	
	public Pizza getPizza()	{	return pizzabuilder.getPizza();	}
	
	public void constructPizza()
	{
		pizzabuilder.createNewPizzaProduct();
		pizzabuilder.buildSauce();
		pizzabuilder.buildTopping();
		pizzabuilder.buildDough();
	}
	
}