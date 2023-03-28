package com.core.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String mobile;
	private String email;
	private Long poNumber;
	@CreationTimestamp
	private LocalDate localDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OrderItems orderitems;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

}
