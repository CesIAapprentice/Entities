import java.util.HashMap;

public class Customer {
	
	private HashMap<Order, Orderline> orders;

	private String name ;
	private String deliveryAddress;
	private String phone;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	
	
	public Customer(String name, String deliveryAddress, String phone) {
		this.name = name;
		this.deliveryAddress = deliveryAddress;
		this.phone = phone;
		this.orders = new HashMap<Order, Orderline>();
	}
	
// ----------------------------------------------------------------
// METHODS
	
	public boolean buyProduct(Product product) {
		return false;
	}
	
	
// ----------------------------------------------------------------
// GETTERS & SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public HashMap<Order, Orderline> getOrders() {
		return orders;
	}

	public void setOrders(HashMap<Order, Orderline> orders) {
		this.orders = orders;
	}
}