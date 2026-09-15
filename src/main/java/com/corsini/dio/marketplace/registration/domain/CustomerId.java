package com.corsini.dio.marketplace.registration.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record CustomerId(UUID id) {
    public CustomerId{
        Assert.notNull(id, "id must not be null");
    }
    
    public CustomerId(){
        this(UUID.randomUUID());
    }
}
