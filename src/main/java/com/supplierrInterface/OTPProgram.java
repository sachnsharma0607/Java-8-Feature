package com.supplierrInterface;

import java.util.function.Supplier;

public class OTPProgram {
	public static void main(String[] args) {
		Supplier<String> randomValue = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("first OTP :" + randomValue.get());
		System.out.println("Second OTP :" + randomValue.get());
		System.out.println("Third OTP :" + randomValue.get());
	}
}
