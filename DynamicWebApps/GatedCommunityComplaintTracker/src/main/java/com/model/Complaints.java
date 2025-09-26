package com.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Complaints")
public class Complaints {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintId;
	
	private String Category;
	
	private String description;
	
	private String priority;
	
	private String name;
	
	private String block;
	
	private int flatNo;
	
	private Date dateRaised;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "residentId", nullable = false)
    private ResidentDetails residentdetails;

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public Date getDateRaised() {
		return dateRaised;
	}

	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", Category=" + Category + ", description=" + description
				+ ", priority=" + priority + ", name=" + name + ", block=" + block + ", flatNo=" + flatNo
				+ ", dateRaised=" + dateRaised + "]";
	}

	public Complaints(int complaintId, String category, String description, String priority, String name, String block,
			int flatNo, Date dateRaised) {
		super();
		this.complaintId = complaintId;
		Category = category;
		this.description = description;
		this.priority = priority;
		this.name = name;
		this.block = block;
		this.flatNo = flatNo;
		this.dateRaised = dateRaised;
	}

	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complaints(String category2, String description2, String priority2, String name2, String block2, int flatNo2,
			String dateraised2) {
		// TODO Auto-generated constructor stub
	}
		
}
