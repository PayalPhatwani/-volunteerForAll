package com.VFA.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class requestBean {

	@Id
	@Column(name = "req-id")
	private Long id;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "subject" ,length = 800)
	private String emailbody;
	
	@ManyToOne
	private Long needy_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmailbody() {
		return emailbody;
	}

	public void setEmailbody(String emailbody) {
		this.emailbody = emailbody;
	}

	public Long getNeedy_id() {
		return needy_id;
	}

	public void setNeedy_id(Long needy_id) {
		this.needy_id = needy_id;
	}

	public requestBean(Long id, String subject, String emailbody, Long needy_id) {
		super();
		this.id = id;
		this.subject = subject;
		this.emailbody = emailbody;
		this.needy_id = needy_id;
	}

	public requestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
