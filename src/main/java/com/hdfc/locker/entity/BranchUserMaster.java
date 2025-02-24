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
@Table(name = "branch_user_master")
public class BranchUserMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_user_id")
	private Integer branchUserId;
	
	@Column(name = "emp_code", length = 100)
	private String empCode;
	
	@Column(name = "emp_name", length = 100)
	private String empName;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "phone_no", length = 20)
	private String phoneNo;
	
	@Column(name = "status", length = 50)
	private String status;
	
	@Column(name = "branch_id")
	private Integer branchId;
	
	@Column(name = "mfa_code", length = 50)
	private String mfaCode;
	
	@Column(name = "mfa_code_date")
	private java.sql.Timestamp mfaCodeDate;
	
	@Column(name = "created_by", length = 100)
	private String createdBy;
	
	@Column(name = "created_date")
	private java.sql.Timestamp createdDate;
	
	@Column(name = "updated_by", length = 100)
	private String updatedBy;
	
	@Column(name = "updated_date")
	private java.sql.Timestamp updatedDate;
}
