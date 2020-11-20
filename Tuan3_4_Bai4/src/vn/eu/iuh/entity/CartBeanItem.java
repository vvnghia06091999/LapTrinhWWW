package vn.eu.iuh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CartBeanItem")
public class CartBeanItem implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String strModelDescription;
	private double dbUnitCost;
	private int iQuantity;
	private double dbTotalCost;

	public CartBeanItem() {
		super();
	}

	public CartBeanItem(String strModelDescription, double dbUnitCost, int iQuantity, double dbTotalCost) {
		super();
		this.strModelDescription = strModelDescription;
		this.dbUnitCost = dbUnitCost;
		this.iQuantity = iQuantity;
		this.dbTotalCost = dbTotalCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStrModelDescription() {
		return strModelDescription;
	}

	public void setStrModelDescription(String strModelDescription) {
		this.strModelDescription = strModelDescription;
	}

	public double getDbUnitCost() {
		return dbUnitCost;
	}

	public void setDbUnitCost(double dbUnitCost) {
		this.dbUnitCost = dbUnitCost;
	}

	public int getiQuantity() {
		return iQuantity;
	}

	public void setiQuantity(int iQuantity) {
		this.iQuantity = iQuantity;
	}

	public double getDbTotalCost() {
		return dbTotalCost;
	}

	public void setDbTotalCost(double dbTotalCost) {
		this.dbTotalCost = dbTotalCost;
	}

	@Override
	public String toString() {
		return "CartBeanItem [id=" + id + ", strModelDescription=" + strModelDescription + ", dbUnitCost=" + dbUnitCost
				+ ", iQuantity=" + iQuantity + ", dbTotalCost=" + dbTotalCost + "]";
	}

}
