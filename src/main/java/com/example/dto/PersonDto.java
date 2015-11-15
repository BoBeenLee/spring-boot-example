package com.example.dto;

import com.example.dummy.Dummy;

/**
 * Created by BoBinLee on 2015. 10. 26..
 */
public class PersonDto {
	@Dummy(value = "name")
	private String name;
	@Dummy(value = "email")
	private String email;
	@Dummy(value = "mobile")
	private String mobile;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
