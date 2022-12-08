package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.DayWeek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayWeekRepository extends JpaRepository<DayWeek, Long> {
}
