package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Question {
	@Id
	private int Q_id;
	private String Q_name;
	
//	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Answer ans;
	
	public String getQ_name() {
		return Q_name;
	}
	public void setQ_name(String q_name) {
		Q_name = q_name;
	}
	public void setQ_id(int q_id) {
		Q_id = q_id;
	}
	
	
	public int getQ_id() {
		return Q_id;
	}
	public void setQ_no(int q_id) {
		Q_id = q_id;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	} 
	
	

}
