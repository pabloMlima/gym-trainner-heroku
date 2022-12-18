package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.TrainingDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingDivisionRepository extends JpaRepository<TrainingDivision, Long> {
}
