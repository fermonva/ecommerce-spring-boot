package com.fermonva.ecommerce.repositories;

import com.fermonva.ecommerce.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface StateRepository extends JpaRepository<State, Short> {

    List<State> findByCountryCode(@Param("code") String code);
}
