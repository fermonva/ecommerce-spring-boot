package com.fermonva.ecommerce.repositories;

import com.fermonva.ecommerce.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface CountryRepository extends JpaRepository<Country, Short> {
}
