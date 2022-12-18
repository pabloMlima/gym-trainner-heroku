package com.api.gymtrainner.repository;

import com.api.gymtrainner.models.DayWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayWeekRepository extends JpaRepository<DayWeek, Long> {
}
