package com.dl.day10.encapsulation;

public class RegisteriImpl extends Register {
	public static void main(String[] args) {

		RegisteriImpl registeriImpl = new RegisteriImpl();
		registeriImpl.setId(101);
		registeriImpl.setUserName("Hansna kriiti");
		registeriImpl.setContactNo(9876543210l);
		registeriImpl.setAddress("hyd");
		registeriImpl.setEmail("Hansnakriiti@gmail.com");

		System.out.println(registeriImpl.getId());
		System.out.println(registeriImpl.getUserName());
		System.out.println(registeriImpl.getContactNo());
		System.out.println(registeriImpl.getEmail());

	}

}
