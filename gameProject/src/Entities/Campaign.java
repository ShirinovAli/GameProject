package Entities;

public class Campaign {
	private int id;
	private String title;
	private String description;
	private int discount;
	
	public Campaign() {}
	
	public Campaign(int id, String title, String description, int discount) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
