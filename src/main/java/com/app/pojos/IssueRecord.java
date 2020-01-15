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
public class IssueRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private BookCopy copy;
	@ManyToOne
	private User user;
	@Temporal(TemporalType.DATE)
	private Date issue_date;
	@Temporal(TemporalType.DATE)
	private Date due_date;
	@Temporal(TemporalType.DATE)
	private Date return_date;
	private int fine_amt;
	
	
	public IssueRecord() {
		// TODO Auto-generated constructor stub
	}

	public IssueRecord(Date issue_date, Date due_date, Date return_date, int fine_amt) {
		super();
		this.issue_date = issue_date;
		this.due_date = due_date;
		this.return_date = return_date;
		this.fine_amt = fine_amt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BookCopy getCopy() {
		return copy;
	}

	public void setCopy(BookCopy copy) {
		this.copy = copy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public int getFine_amt() {
		return fine_amt;
	}

	public void setFine_amt(int fine_amt) {
		this.fine_amt = fine_amt;
	}
	
}
