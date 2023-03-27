package com.softserve.java.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
	@ParameterizedTest
	@ValueSource(strings = {
            "userName@mail.uA",
            "user1NamE@mail.ua",
            "user.name@mail.ua",
            "us.er.name@mail.ua",
            "us.er.name@mail.ua",
            "us.er.na.me@mail.ua",
            "us1er2na3me@mail.ua",
            "us1er.na3m.e@mail.ua",
            "user.name@i.ua",
            "user.name@kh.ua",
            "user.name@kharkiv.ukraine",
            "user.name@kh.ukraine",
            "user.name@kharkiv.ua",
            "user.name@kh.nure.ua",
            "user.name@kh.nu.re.ua",
            "user.name@kh.nu.re.ua"
    })
	public void checkEmailShouldAnswerWithTrue(String text) {
		assertTrue(new Utils().checkEmail(text));
	}

	@ParameterizedTest
	@ValueSource(strings = {
    		"",
    		"@",
            "@mail.ua",
            ".@mail.ua",
            "1@mail.ua",
            ".1@mail.ua",
            "1a@mail.ua",
            "a1@mail.ua",
            ".a.@mail.ua",
            "1a1@mail.ua",
            "UserName1@mail.UA",
            "user_name@mail.ua",
            "user-name@mail.ua",
            "username_@mail.ua",
            "user.name@",
            "user.name@.",
            "user.name@k.u",
            "user.name@1.2",
            "user.name@mail.u",
            "user.name@mail,ua",
            "user.name@mail_ua"
    })
	public void checkEmailShouldAnswerWithFalse(String text) {
		assertFalse(new Utils().checkEmail(text));
	}
} 