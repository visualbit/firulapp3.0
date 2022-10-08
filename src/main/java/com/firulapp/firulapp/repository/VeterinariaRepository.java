
package com.firulapp.firulapp.repository;

import com.firulapp.firulapp.domain.Veterinaria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VeterinariaRepository extends JpaRepository<Veterinaria, Integer> {
    @Query(
            value = "select * from veterinaria",
            nativeQuery = true
    )
    List<Veterinaria> buscarTodos();

    @Query(
            value = "select * from veterinaria where veterinaria.id_veterinaria LIKE %:id% ",
            nativeQuery = true
    )
    List<Veterinaria> findById(@Param("id") String id);

    @Query(
            value = "SELECT * FROM veterinaria WHERE veterinaria.ciudad LIKE %:q% ",
            nativeQuery = true
    )
    List<Veterinaria> findByCity(@Param("q") String q);
}
