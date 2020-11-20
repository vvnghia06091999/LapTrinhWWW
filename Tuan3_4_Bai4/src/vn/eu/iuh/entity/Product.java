package vn.eu.iuh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Product")
public class Product implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String model;
	private String description;
	private int quantitty;
	private double price;
	private String imgURL;

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantitty() {
		return quantitty;
	}

	public void setQuantitty(int quantitty) {
		this.quantitty = quantitty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public Product(String model, String description, int quantitty, double price, String imgURL) {
		super();
		this.model = model;
		this.description = description;
		this.quantitty = quantitty;
		this.price = price;
		this.imgURL = imgURL;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", model=" + model + ", description=" + description + ", quantitty=" + quantitty
				+ ", price=" + price + ", imgURL=" + imgURL + "]";
	}

}
