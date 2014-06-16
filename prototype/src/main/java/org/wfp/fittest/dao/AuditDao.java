package org.wfp.fittest.dao;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.AuditRecord;
import org.wfp.fittest.entity.OperationType;

public interface AuditDao {

	/* ====================================================================== */
	// Audit Record
	/* ====================================================================== */

	public AuditRecord findAuditById(Integer id);

	public List<AuditRecord> findAllAudits();

	public List<AuditRecord> findAuditsByDate(Date date);

	public List<AuditRecord> findAuditsBeforeDate(Date date);

	public List<AuditRecord> findAuditsAfterDate(Date date);

	public List<AuditRecord> findAuditsByDuration(Date startDate, Date endDate);

	public List<AuditRecord> findAuditsByOperationType(
			OperationType operationType);

	public List<AuditRecord> findAuditsByOldValue(String oldValue);

	public List<AuditRecord> findAuditsByNewValue(String newValue);

	public List<AuditRecord> findAuditsByOldValueAndNewValue(String oldValue,
			String newValue);

	public List<AuditRecord> findAuditsByIPAddressPattern(
			String ipAddressPattern);

	public List<AuditRecord> findAuditsByTableName(String tableName);

	public List<AuditRecord> findAuditsByUserID(String userID);

	public void deleteAudit(AuditRecord audit);

	public void deleteAllAudits();

	public void deleteAuditsByDate(Date date);

	public void deleteAuditsBeforeDate(Date date);

	public void deleteAuditsAfterDate(Date date);

	public void deleteAuditsByDuration(Date startDate, Date endDate);

	public void deleteAuditsByOperationType(OperationType operationType);

	public void deleteAuditsByOldValue(String oldValue);

	public void deleteAuditsByNewValue(String newValue);

	public void deleteAuditsByOldValueAndNewValue(String oldValue,
			String newValue);

	public void deleteAuditsByIPAddressPattern(String ipAddressPattern);

	public void deleteAuditsByTableName(String tableName);

	public void deleteAUditsByUserID(String userID);

	public void saveAudit(AuditRecord audit);

	/* ====================================================================== */
	// Operation Type
	/* ====================================================================== */

	public OperationType findOperationTypeById(Integer id);
	
	public List<OperationType> findAllOperationTypes();

	public List<OperationType> findOperationTypeByOperationName(
			String operationName);
	
	public void deleteOperationType(OperationType operationType);
	
	public void deleteOperationTypeById(Integer id);
	
	public void deleteAllOperationTypes();

	public void deleteOperationTypeByOperationName(String operationName);

	public void saveOperationType(OperationType operationType);
}
