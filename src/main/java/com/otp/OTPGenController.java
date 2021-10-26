package com.otp;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller class will be used for generating OTP.
 * 
 * @author student technique
 *
 */

@Controller
public class OTPGenController {

	/**
	 * This generateOtp method will return the generated OTP.
	 * 
	 * @return
	 */
	@GetMapping("/otp")
	public ResponseEntity<OTP> generateOtp() {
		
		String id = String.format("%04d", ThreadLocalRandom.current().nextInt(1, 9999));
		OTP otp=new OTP();
		otp.setOtp(id);
		return ResponseEntity.ok(otp);
	}
}
