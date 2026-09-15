package com.corsini.dio.marketplace.registration.infrastructure.persistence.entity.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.corsini.dio.marketplace.registration.infrastructure.persistence.entity.Customer;


@Projection(name = "except", types = Customer.class)
public interface CustomerExcerpt {

    String getFirstName();
    String getLastName();

    @Value("#{target.address.toString()}")
    String getAddress();

}
