package com.Aahar.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CustomerId;
	
	private String firstName;
	private String lastName;
	private Integer age;
	private Gender gender;
	private String mobileNumber;
	private Address address;
	private String email;

}
