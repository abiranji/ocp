public class Order {
	int orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	
	public Order(int d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
