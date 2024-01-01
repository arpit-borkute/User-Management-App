package com.app.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USER_MASTER")
@Data
public class UserMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String fullname;

	private String email;

	private Long mobile;

	private String gender;

	private LocalDate dob;

	private Long ssn;

	private String password;

	private String accStatus;

	@CreationTimestamp
	@Column(name = "create_date", updatable = false)
	private LocalDate createdDate;

	@CreationTimestamp
	@Column(name = "updated_date", insertable = false)
	private LocalDate updatedDate;

	private String createdBy;

	private String updatedBy;

}
