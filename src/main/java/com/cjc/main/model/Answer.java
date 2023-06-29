package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Answer {
	 @Id
       private int A_id;
	   private String A_name;
       @ManyToOne(cascade = CascadeType.ALL)
       @JsonBackReference
       private Question que;

       
	public String getA_name() {
		return A_name;
	}

	public void setA_name(String A_name) {
		this.A_name = A_name;
	}

	public int getA_id() {
		return A_id;
	}

	public void setA_id(int a_id) {
		A_id = a_id;
	}

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}
       
}

