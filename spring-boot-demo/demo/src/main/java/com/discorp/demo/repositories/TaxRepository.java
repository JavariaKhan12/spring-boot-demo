package com.discorp.demo.repositories;

import com.discorp.demo.domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaxRepository extends JpaRepository<Tax, Long> {
    @Override
    Optional<Tax> findById(Long aLong);

}
