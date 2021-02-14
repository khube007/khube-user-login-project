package org.kk.spring.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table (name = "user_new")
public class User {

	@Id
	@Column (name = "user_id")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column (name = "email")
	private String email;
	
	//@Transient
	@Column (name = "password")
	private String password;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column (name = "last_name")
	private String lastName;
	
	@Column (name = "list_students")
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Student> listStudent = new ArrayList<Student>();
	
}
