package web.designpattern.builder;

public class Pizza {

	private String Dough="";
	private String Topping="";
	private String Sauce="";
	
	public String getDough() {
		return Dough;
	}
	public void setDough(String dough) {
		Dough = dough;
	}
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}
	public String getSauce() {
		return Sauce;
	}
	public void setSauce(String sauce) {
		Sauce = sauce;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+Dough+" "+Sauce+" "+Topping;
	}
}