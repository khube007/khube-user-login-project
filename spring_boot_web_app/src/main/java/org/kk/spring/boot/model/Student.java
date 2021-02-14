package org.kk.spring.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table (name = "student_tab_new")
@SecondaryTable (name = "gender_tab")
@JsonInclude(Include.NON_EMPTY) 
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "st_id")
	private Long sid;
	
	@Column (name = "st_name")
	private String sname;
	
	@ElementCollection
	@CollectionTable (name = "hobbies_tab", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn (name = "hob")
	@Column (name = "hobbies")
	private List<String> hobbies = new ArrayList<String>();
	
	@Column (name = "age")
	private int age;
	
	@Column (name = "gender", table = "gender_tab")
	private String gender;
	
	@Column (name = "mobile_number")
	private String mobileNumber;
	
	@Column (name = "fees")
	private Double fees;
	
	@OneToMany (mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Column (name = "address_tab")
	private List<Address> address = new ArrayList<Address>();
}
