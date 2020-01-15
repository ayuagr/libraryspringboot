package com.app.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private User user;
	private float amount;
	private String fee;
	@Temporal(TemporalType.TIMESTAMP)
	private Date transaction_time;
	@Temporal(TemporalType.DATE)
	private Date next_duedate;
	 
	public Payment() {
		
	}

	public Payment(float amount, String fee, Date transaction_time, Date next_duedate) {
		super();
		this.amount = amount;
		this.fee = fee;
		this.transaction_time = transaction_time;
		this.next_duedate = next_duedate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public Date getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(Date transaction_time) {
		this.transaction_time = transaction_time;
	}

	public Date getNext_duedate() {
		return next_duedate;
	}

	public void setNext_duedate(Date next_duedate) {
		this.next_duedate = next_duedate;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", fee=" + fee + ", transaction_time=" + transaction_time
				+ ", next_duedate=" + next_duedate + "]";
	}

	
	
}
