package web.designpattern.decorator;

public class BeverageDriverClass {

	public static void main(String[] args) {
		Beverage bev1 = new Expresso();
		bev1 = new Mocha(bev1);
		bev1 = new Milk(bev1);
		bev1 = new Soy(bev1);
		
		System.out.println(bev1.getDescription()+"  $"+bev1.getCost());
	}
}
