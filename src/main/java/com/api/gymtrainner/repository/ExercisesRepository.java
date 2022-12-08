package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercisesRepository extends JpaRepository<Exercises, Long> {
}
