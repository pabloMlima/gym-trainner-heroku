package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.Muscles;
import com.api.gymtrainner.models.MusclesCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MusclesCategoryRepository extends JpaRepository<MusclesCategory, Long> {

    @Query(
            value = "SELECT * FROM muscles WHERE name = :name LIMIT 1",
            nativeQuery = true
    )
    Optional<MusclesCategory> findByMuscleCategory(@Param("name") String name);
}
