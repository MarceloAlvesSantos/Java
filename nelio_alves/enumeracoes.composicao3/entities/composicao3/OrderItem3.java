package entities.composicao3;

public class OrderItem3 {
	private Integer quantity;
	private Double price;
	
	private Product3 product; // Composição com o Product
	
	public OrderItem3() {
		
	}

	public OrderItem3(Integer quantity, Double price, Product3 product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product3 getProduct() {
		return product;
	}

	public void setProduct(Product3 product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProduct().getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
	
}
