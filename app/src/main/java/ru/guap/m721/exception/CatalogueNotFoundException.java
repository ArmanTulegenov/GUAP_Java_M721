package ru.guap.m721.exception;

public class CatalogueNotFoundException extends RuntimeException {

    private static final String CATALOGUE_NOT_FOUND_EXCEPTION = "Catalogue not found";

    public CatalogueNotFoundException() {
        super(CATALOGUE_NOT_FOUND_EXCEPTION);
    }

    public CatalogueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
