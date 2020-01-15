package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,email;
	private long phone;
	private String password;
	@Enumerated(EnumType.STRING)
	private UserRole role;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<IssueRecord> issue_records;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Payment> payments;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, long phone, String password, UserRole role) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<IssueRecord> getIssue_records() {
		return issue_records;
	}

	public void setIssue_records(List<IssueRecord> issue_records) {
		this.issue_records = issue_records;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public void addIssueRecord(IssueRecord r)
	{
		issue_records.add(r);
		r.setUser(this);
	}
	
	public void removeIssueRecord(IssueRecord r)
	{
		issue_records.remove(r);
		r.setUser(null);
	}
	
	public void addPayment(Payment p)
	{
		payments.add(p);
		p.setUser(this);
	}
	
	public void removePayment(Payment p)
	{
		payments.add(p);
		p.setUser(null);	
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", role=" + role + "]";
	}
	
}
