package com.test.demo.io.request;

import lombok.Data;

@Data
public class customerReq {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
}
