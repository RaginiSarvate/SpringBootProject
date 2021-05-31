package com.springrest.springrest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loads")
public class Load {
	
	@Id
	private long id;
	@Column(name= "loadingPoint")
	private String loadingPoint;
	@Column(name= "unloadingPoint")
	private String unloadingPoint;
	@Column(name= "productType")
	private String productType;
	@Column(name= "truckType")
	private String truckType;
	@Column(name= "noOfTrucks")
	private int noOfTrucks;
	@Column(name= "weight")
	private float weight;
	@Column(name= "comment")
	private String comment;
	@Column(name= "shipperId")
	private String shipperId;
	@Column(name= "Date")
	private String Date;
	public Load(long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, float weight, String comment, String shipperId, String date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		Date = date;
	}
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", Date=" + Date + "]";
	}
	
}