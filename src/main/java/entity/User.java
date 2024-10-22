package entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String username;
private String email;
private String password;
private int age;
private String state;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(String username, String email, String password, String state, int age) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.state = state;
	this.age = age;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [username=" + username + ", email=" + email + ", password=" + password + ", state=" + state + ", age="
			+ age + "]";
}






}
