package edu.icet.repository;

import edu.icet.entity.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveEntity, Integer> {
}
