package com.otp;

public class OTP {

	private int id;
	private String otp;
	
	public OTP() {	}

	public OTP(int id, String otp) {
		super();
		this.id = id;
		this.otp = otp;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the otp
	 */
	public String getOtp() {
		return otp;
	}

	/**
	 * @param otp the otp to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "OTP [id=" + id + ", otp=" + otp + "]";
	}
	
	
}
