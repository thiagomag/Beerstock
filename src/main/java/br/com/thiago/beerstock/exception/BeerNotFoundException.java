package br.com.thiago.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String beerName) {
        super(String.format("Beer with name %s not found in the system.", beerName));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Beer with id %s not found in the system.", id));
    }
}
