package game;

public class Game {
	private double price;
	private String name;
	private String category;
	public Game() {
		super();
	}
	public Game(double price, String name, String category) {
		super();
		this.price = price;
		this.name = name;
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
