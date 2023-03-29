package com.core.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class RdDocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rdId;
	private String userName;
	private Long poNumber;
	private LocalDate docCreationDate;
	private String acknowledgementType;
	@OneToOne(cascade = CascadeType.ALL)
	private OrderItems orderitems;

}
