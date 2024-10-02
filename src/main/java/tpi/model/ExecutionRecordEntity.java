package tpi.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "execution_record")
public class ExecutionRecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serno;
	
	@Column(name = "serviceName")
	private String serviceName;
	
	@Column(name = "msgid")
	private String msgid;
	
	@Column(name = "requestPayload")
	private String requestPayload;
	
	@Column(name = "request_timestamp")
	private Date requestTimestamp;
}
