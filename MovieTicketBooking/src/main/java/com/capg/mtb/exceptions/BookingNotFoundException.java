package com.capg.mtb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="id is not available")
public class BookingNotFoundException extends Exception {
public BookingNotFoundException()
{
	super();
}
public BookingNotFoundException(String msg)
{
	super(msg);
}
}
