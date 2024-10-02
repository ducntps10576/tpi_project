package tpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpi.exception.ConflictException;
import tpi.model.ExecutionRecordEntity;
import tpi.service.ExecutionRecordService;

@RestController
@RequestMapping(value = "/executionRecord")
public class ExecutionRecordController {

	@Autowired
	private ExecutionRecordService service;
	
	@PostMapping(value = "/saveRecord")
	public ResponseEntity<String> saveRecord(@RequestBody ExecutionRecordEntity record) {
		if (validConflict(record)) {
            throw new ConflictException("409");
        }
        service.saveRecord(record);
        return new ResponseEntity<>("Created execution record", HttpStatus.CREATED);
	}
	
	private boolean validConflict(ExecutionRecordEntity record) {
		if (record.getMsgid().equals("111")) {//set something logic for conflict
			return true;
		}
		return false;
	}
}
