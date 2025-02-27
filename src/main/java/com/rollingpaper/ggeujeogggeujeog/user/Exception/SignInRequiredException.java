package com.rollingpaper.ggeujeogggeujeog.user.exception;

import org.springframework.http.HttpStatus;

import com.rollingpaper.ggeujeogggeujeog.common.error.BaseException;
import com.rollingpaper.ggeujeogggeujeog.common.error.ExceptionCode;

public class SignInRequiredException extends BaseException {

	private static final String errorCode = ExceptionCode.UNAUTHORIZED_ACCESS.getErrorCode();
	private static final HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;
	private static final String errorMessage = "로그인이 필요합니다.";

	public SignInRequiredException() {
		this(errorCode, httpStatus, errorMessage);
	}

	public SignInRequiredException(String errorCode, HttpStatus httpStatus, String errorMessage) {
		super(errorCode, httpStatus, errorMessage);
	}
}
