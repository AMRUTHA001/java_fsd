package Hotelsearching;

public class hotelss {
	String name;
	String budget;
	String id;
	public hotelss(String name, String budget, String price) {
		super();
		this.name = name;
		this.budget = budget;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getPrice() {
		return id;
	}
	public void setPrice(String price) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "hotelss [name=" + name + ", budget=" + budget + ", id=" + id + "]";
	}
}
