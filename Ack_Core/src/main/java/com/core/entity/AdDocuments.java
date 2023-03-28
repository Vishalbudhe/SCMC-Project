package com.core.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class AdDocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private Long poNumber;
	@CreationTimestamp
	private LocalDate docCreateDate;
	private String acknowledgementType;
	@OneToOne(cascade = CascadeType.ALL)
	private OrderItems orderitems;

}
