package edu.eci.ieti.Users.exception;

import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends  RuntimeException{
    public InternalServerErrorException(ServerErrorResponseDto user_not_found, HttpStatus notFound) {

    }
}
