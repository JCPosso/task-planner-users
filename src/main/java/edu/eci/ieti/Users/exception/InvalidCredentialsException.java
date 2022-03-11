package edu.eci.ieti.Users.exception;

import org.springframework.http.HttpStatus;
import edu.eci.ieti.Users.exception.ErrorCodeEnum;
import edu.eci.ieti.Users.exception.ServerErrorResponseDto;


public class InvalidCredentialsException extends InternalServerErrorException
{
    public InvalidCredentialsException() {
        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}