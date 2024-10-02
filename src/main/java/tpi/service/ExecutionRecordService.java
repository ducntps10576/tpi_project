package tpi.service;

import tpi.model.ExecutionRecordEntity;

public abstract interface ExecutionRecordService {

	public abstract void saveRecord(ExecutionRecordEntity argEntity);
}
