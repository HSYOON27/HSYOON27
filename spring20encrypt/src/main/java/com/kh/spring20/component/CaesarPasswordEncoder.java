package com.kh.spring20.component;

public interface CaesarPasswordEncoder {
	String enrypt(String origin);
	String decrypt(String value);
}
