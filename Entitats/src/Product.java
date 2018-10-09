
public class Product {
	
	private String name;
	private float price;
	private String remarks;
	
// ----------------------------------------------------------------
// CONSTRUCTOR		
	
	public Product(String name, float price, String remarks) {
		this.name = name;
		this.price = price;
		this.remarks = remarks;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}