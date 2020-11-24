package classpart;

public class OnlineOrder {
	
	String orderNumber;
	String customerId;
	String orderDate;
	String customerName;
	String productId;
	String address;
		
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String get() {
		return orderNumber;
	}

	public static void main(String[] args) {
		OnlineOrder customerJames = new OnlineOrder();
		customerJames.orderNumber = "201802120001";
		customerJames.customerId = "abc123";
		customerJames.orderDate = "2019년 3월 12일";
		customerJames.customerName = "홍길순";
		customerJames.productId = "PD0345-12";
		customerJames.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(customerJames.orderNumber);
		System.out.println(customerJames.get());
		System.out.println(customerJames.customerId);
		System.out.println(customerJames.orderDate);
		System.out.println(customerJames.customerName);
		System.out.println(customerJames.productId);
		System.out.println(customerJames.address);
	}

}
