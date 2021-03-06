package org.egov.bookings.service;

import java.util.List;

import org.egov.bookings.contract.BookingApprover;
import org.egov.bookings.contract.MasterRequest;
import org.egov.bookings.model.InventoryModel;
import org.egov.bookings.model.OsbmApproverModel;
import org.egov.bookings.model.OsbmFeeModel;
import org.egov.bookings.model.OsujmFeeModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface MasterService.
 */
public interface MasterService {
	
	/**
	 * Gets the park community inventory details.
	 *
	 * @param venue the venue
	 * @param sector the sector
	 * @return the park community inventory details
	 */
	public List< InventoryModel > getParkCommunityInventoryDetails(String venue, String sector);
	
	/**
	 * Creates the approver.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsbmApproverModel> createApprover(MasterRequest masterRequest);
	
	/**
	 * Update approver.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsbmApproverModel> updateApprover(MasterRequest masterRequest);
	
	/**
	 * Creates the OSBM fee.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsbmFeeModel> createOSBMFee(MasterRequest masterRequest);
	
	/**
	 * Update OSBM fee.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsbmFeeModel> updateOSBMFee(MasterRequest masterRequest);
	
	/**
	 * Creates the OSUJM fee.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsujmFeeModel> createOSUJMFee(MasterRequest masterRequest);
	
	/**
	 * Update OSUJM fee.
	 *
	 * @param masterRequest the master request
	 * @return the list
	 */
	public List<OsujmFeeModel> updateOSUJMFee(MasterRequest masterRequest);
	
	/**
	 * Fetch all approver.
	 *
	 * @return the list
	 */
	public List<BookingApprover> fetchAllApprover();
	
	/**
	 * Fetch all approver details.
	 *
	 * @return the list
	 */
	public List<OsbmApproverModel> fetchAllApproverDetails();
	
	/**
	 * Fetch all OSB mfee.
	 *
	 * @return the list
	 */
	public List<OsbmFeeModel> fetchAllOSBMfee();
	
	/**
	 * Fetch all OSUJ mfee.
	 *
	 * @return the list
	 */
	public List<OsujmFeeModel> fetchAllOSUJMfee();

}
