
public class Main {

	public static void main(String[] args) {
		CorporateCustomer ces = new CorporateCustomer("Ces", "Valldemossa 62", "667250338", 'A', 500);
		Product tele = new Product("tele", 100.0f, "");
		Product tablet = new Product("tablet", 150.0f, "");
		ces.buyProduct(tele, 2);
		ces.buyProduct(tablet, 3);
		ces.closeOrder();
		//System.out.println("test");
		System.out.println(ces.getOrders().size());
		
		for(Order order : ces.getOrders().keySet()) {
			
			for(Product product : order.getOrderline().getOrderDetail().keySet()) {
				System.out.println(product.getName() + " " + order.getOrderline().getOrderDetail().get(product));
			}
			System.out.println("TOTAL: " + order.getPrice());
		}		
	}
}