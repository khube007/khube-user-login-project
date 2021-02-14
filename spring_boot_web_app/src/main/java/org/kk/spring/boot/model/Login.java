package org.kk.spring.boot.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table (name = "login_tab")
@Entity
public class Login {

	@Id
	@Column (name = "user_id")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column (name = "user_name")
	private String userName;
	
	@Column (name = "password")
	private String password;
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Login))
			return false;
		Login login = (Login) o;
		return  Objects.equals(this.userId, login.userId) &&
				Objects.equals(this.userName, login.userName) &&
				Objects.equals(this.password, login.password);
	}
	
	public int hashCode() {
		return Objects.hash(this.userId, this.userName, this.password);
	}
}
