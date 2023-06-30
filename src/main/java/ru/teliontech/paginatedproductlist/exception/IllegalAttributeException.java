package ru.teliontech.paginatedproductlist.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalAttributeException extends RuntimeException {
    private static final Logger LOGGER = LoggerFactory.getLogger(IllegalAttributeException.class);
    public IllegalAttributeException(String message) {
        super(message);
        LOGGER.warn(message);
    }
}
