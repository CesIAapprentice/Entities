import java.util.Date;

public class Order {
	
	private Orderline orderline;

	private Date dateReceived;
	private Boolean isPrepaid;
	private String num;
	private float price;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	
	
	public Order(Date dateReceived, Boolean isPrepaid, String num, float price) {
		this.dateReceived = dateReceived;
		this.isPrepaid = isPrepaid;
		this.num = num;
		this.price = price;
		this.orderline = new Orderline();
	}
	
	
// ----------------------------------------------------------------
// METHODS
	
	public boolean dispatch() {
		return false;
	}
	
	public boolean close() {
		return false;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS	

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Boolean getIsPrepaid() {
		return isPrepaid;
	}

	public void setIsPrepaid(Boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}