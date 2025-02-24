package com.hdfc.locker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "branch_master")
public class BranchMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private Integer branchId;
	
	@Column(name = "branch_name", length = 150)
	private String branchName;
	
	@Column(name = "branch_address", length = 255)
	private String branchAddress;
	
	@Column(name = "branch_locality", length = 150)
	private String branchLocality;
	
	@Column(name = "branch_pincode")
	private Integer branchPincode;
	
	@Column(name = "branch_status", length = 50)
	private String branchStatus;
	
	@Column(name = "city_id")
	private String cityId;
	
	@Column(name = "created_by", length = 100)
	private String createdBy;
	
	@Column(name = "created_date")
	private java.sql.Timestamp createdDate;
	
	@Column(name = "updated_by", length = 100)
	private String updatedBy;
	
	@Column(name = "updated_date")
	private java.sql.Timestamp updatedDate;
	
	
}
