package tpi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpi.model.ExecutionRecordEntity;
import tpi.repository.ExecutionRecordRepository;
import tpi.service.ExecutionRecordService;

@Service
public class ExecutionRecordDAO implements ExecutionRecordService {

	@Autowired
	private ExecutionRecordRepository repo;
	
	@Override
	public void saveRecord(ExecutionRecordEntity argEntity) {
		repo.save(argEntity);
	}
}
