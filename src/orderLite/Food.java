package orderLite;

import java.math.BigDecimal;

import javax.swing.ImageIcon;

public class Food {
	private BigDecimal price;
	private String name;
	private String picture;
	private String description;
	private ImageIcon icon;

	public Food(String price, String name, String picture, String description, String imageLocation) {
		this.price = new BigDecimal(price);
		this.price.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.icon = new ImageIcon(imageLocation);
	}
	
		
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String kitchenToString() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("Foods:\n"
        			+ "Price: %s\n"
        			+ "Name: %s\n"
        			+ "Picture: %s\n"
        			+ "Description: %s\n"
        			+ "ImageIcon Link: %s\n",
        			getPrice(), getName(), getPicture(), getDescription(), icon);
	}
	/*
	 * I got rid of the main in food, because it didn't need to be here.
	 */

}
