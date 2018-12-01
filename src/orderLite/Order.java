package orderLite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Food> foodItemList = new ArrayList<Food>();
	private BigDecimal orderPrice = new BigDecimal(0);
	private int orderNumber;
	private static int currentOrder = 1000;
	// TO DO: Add orderNumber
	
	public Order() {
		super();
		currentOrder += 1;
		orderNumber = currentOrder;
		this.orderPrice.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
	
	public Order(Order order) {
		this();
		this.foodItemList = order.foodItemList;
		this.orderPrice = order.orderPrice;
	}
	
	public void add(Food food) {
		foodItemList.add(food);
		orderPrice = orderPrice.add(food.getPrice());
		
	}
	
	public void subtract(Food food) {
		foodItemList.remove(food);
		orderPrice = orderPrice.subtract(food.getPrice());
	}
	
	public String kitchenToString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d...........$%.2f\r\n", orderNumber, orderPrice));
		for (Food f : foodItemList) {
			sb.append(String.format("     %s\r\n", f.kitchenToString()));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Food f = new Food("8.50", "Hamburger", "No Picture", "So tasty!", "/resources/hamburger2.jpeg");
		Order o = new Order();
		
		o.add(f);
		o.add(f);
		o.add(f);
		
		
		System.out.println(o.orderPrice);
		System.out.println(o.kitchenToString());
		
		o.subtract(f);
		
		System.out.println(o.orderPrice);
		System.out.println(o.kitchenToString());
		
		Order o2 = new Order();
		
		o2.add(f);
		
		System.out.println(o2.kitchenToString());
		
		
		//new ObjectInputStream(new FileInputStream("RestaurantOrders.ser"));
	
	}

}
