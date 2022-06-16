package com.xworkz.login.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.login.constants.Gender;

import lombok.Data;

@Entity
@Data
@Table(name = "placement")
public class UserEntity {
	/*
	 * @Id
	 * 
	 * @Column(name="Placement-Name")
	 * 
	 * @GeneratedValue(generator="auto")
	 * 
	 * @GenericGenerator(name="auto",strategy="increment") private String Name;
	 * private String Headquarters; private String Founder; private boolean
	 * isProdeuctBased; private long ContactNo; private long NoOfEmployees; private
	 * float Revenue; private String Description;
	 */

	@Id
	@Column(name = "User-Name")
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name = "auto", strategy = "increment")
	private int id;
	private String username;
	private String email;
	private Gender gender;
	private Long contactno;
	private String Password;
}