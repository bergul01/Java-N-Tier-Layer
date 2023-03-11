package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;  

public class Product implements Entity { //product implemente ediyor kimi entity interfacesini
	/*eğer bir class herhangi bir inheritance almıyorsa ilerde problem yaşanır çünkü bu nesne
	 * ile sınırlamalar getirildiğinde bu gruptaki entitylere sınırlama getir dediğinde problem yaşanır
	 * bir class çıplak kalmicak interface veya bir base ile süslenmesi gerekir*/ 
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
	
	public Product() {
		
	}

	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
	
}
