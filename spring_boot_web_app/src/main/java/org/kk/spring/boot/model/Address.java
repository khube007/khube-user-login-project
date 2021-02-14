package org.kk.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "address_tab")
public class Address {

	@Id
	@Column (name = "address_id")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long aid;
	
	@Column (name = "city")
	private String city;
	
	@Column (name = "state")
	private String state;
	
	@ManyToOne
	//@JoinColumn (name = "st_ad_id")
	private Student student;
}
