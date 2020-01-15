package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BookCopy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Book book;
	private int rack;
	private String status;
	@OneToMany(mappedBy = "copy",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<IssueRecord> issue_records;
	
	public BookCopy() {
		// TODO Auto-generated constructor stub
	}

	public BookCopy(int rack, String status) {
		
		this.rack = rack;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<IssueRecord> getIssue_records() {
		return issue_records;
	}

	public void setIssue_records(List<IssueRecord> issue_records) {
		this.issue_records = issue_records;
	}
	
	public void addIssueRecord(IssueRecord r)
	{
		issue_records.add(r);
		r.setCopy(this);
	}
	
	public void removeIssueRecord(IssueRecord r)
	{
		issue_records.remove(r);
		r.setCopy(null);
	}

	@Override
	public String toString() {
		return "BookCopy [id=" + id + ", rack=" + rack + ", status=" + status + "]";
	}

}
