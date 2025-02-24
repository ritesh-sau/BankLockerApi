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
@Table(name = "city_master")
public class CityMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer cityId;
	
	@Column(name = "city_name", length = 100)
	private String cityName;
	
	@Column(name = "city_status", length = 50)
	private String cityStatus;
	
	@Column(name = "state_id")
	private Integer stateId;
	
	@Column(name = "created_by", length = 100)
	private String createdBy;
	
	@Column(name = "created_date")
	private java.sql.Timestamp createdDate;
	
	@Column(name = "updated_by", length = 100)
	private String updatedBy;
	
	@Column(name = "updated_date")
	private java.sql.Timestamp updatedDate;
}
