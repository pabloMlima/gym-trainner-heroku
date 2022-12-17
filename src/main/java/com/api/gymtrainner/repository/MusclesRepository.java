package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.Muscles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MusclesRepository extends JpaRepository<Muscles, Long> {

    @Query(
            value = "SELECT * FROM muscles WHERE name = :name LIMIT 1",
            nativeQuery = true
    )
    Optional<Muscles> findByMuscle(@Param("name") String name);
}
