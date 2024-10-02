package tpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tpi.model.ExecutionRecordEntity;

@Repository
public interface ExecutionRecordRepository extends JpaRepository<ExecutionRecordEntity, Integer> {

}
