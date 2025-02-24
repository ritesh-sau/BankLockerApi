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
@Table(name="state_master")
public class StateMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "state_id")
	private Integer stateId;
	
	@Column(name="state_name", length = 100)
	private String stateName;
	
	@Column(name="state_code", length = 50)
	private String stateCode;
	
	@Column(name = "state_status", length = 50)
	private String stateStatus;
	
	@Column(name = "created_by", length = 100)
	private String createdBy;
	
	@Column(name = "created_date")
	private java.sql.Timestamp createdDate;
	
	@Column(name = "updated_by", length = 100)
	private String updatedBy;
	
	@Column(name = "updated_date")
	private java.sql.Timestamp updatedDate;
	
}
