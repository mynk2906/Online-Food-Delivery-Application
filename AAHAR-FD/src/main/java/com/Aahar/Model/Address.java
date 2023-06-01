package com.Aahar.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String buildingName;
	private String streetNumber;
	private String area;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
}
