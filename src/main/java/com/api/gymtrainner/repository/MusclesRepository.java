package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.Muscles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusclesRepository extends JpaRepository<Muscles, Long> {
}
