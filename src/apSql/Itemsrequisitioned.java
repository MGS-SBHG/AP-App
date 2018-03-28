package apSql;

public class Itemsrequisitioned {

	//attributes
	int itemreqrecordidnbr; 
	int itemidnbr; 
	String itemdescription; 
	int reqnbr; 
	int po_nbr; 
	String sellerinvoicenbr; 
	String rec_rpt_nbr; 
	int selleridnbr; 
	int qtyitemrequested; 
	String acctnbrcharged; 
	String deliverypriority; 
	int qtydelivered; 
	String deliverycondition; 
	int paymentvouchernbr;
	
	public void setItemReqRecordIdNbr(int newValue) {
		itemreqrecordidnbr = newValue;
    }

	public int getItemReqRecordIdNbr() {
    	return itemreqrecordidnbr;
    }
	
	public void setItemIdNbr(int newValue) {
	    	itemidnbr = newValue;
	    }

	public int getItemidNbr() {
	    	return itemidnbr;
	    }
	
	public void setItemDescription(String newValue) {
	    	itemdescription = newValue;
	    }

	public String getItemDescription() {
	    	return itemdescription;
	    }
	
	public void setReqNbr(int newValue) {
		reqnbr = newValue;
    }

	public int getReqNbr() {
    	return reqnbr;
    }

	public void setPO_Nbr(int newValue) {
		po_nbr = newValue;
    }

	public int getPO_Nbr() {
    	return po_nbr;
    }

	public void setSellerInvoiceNbr(String newValue) {
		sellerinvoicenbr = newValue;
    }

	public String getSellerInvoiceNbr() {
    	return sellerinvoicenbr;
    }
	
	public void setRecRptNbr(String newValue) {
		rec_rpt_nbr = newValue;
    }

	public String getRecRptNbr() {
    	return rec_rpt_nbr;
    }
	
	
	public void setSellerIdNbr(int newValue) {
		selleridnbr = newValue;
    }

	public int getSellerIdNbr() {
    	return selleridnbr;
    }
	
	
	public void setQtyItemRequested(int newValue) {
		qtyitemrequested = newValue;
    }

	public int getQtyItemRequested() {
    	return qtyitemrequested;
    }
	
	public void setAcctNbrCharged(String newValue) {
		acctnbrcharged = newValue;
    }

	public String getAcctNbrCharged() {
    	return acctnbrcharged;
    }
	
	public void setDeliveryPriority(String newValue) {
		deliverypriority = newValue;
    }

	public String getGeliveryPriority() {
    	return deliverypriority;
    }

	public void setQtyDelivered(int newValue) {
		qtyitemrequested = newValue;
    }

	public int getQtyDelivered() {
    	return qtyitemrequested;
    }
	
	public void setDeliveryCondition(String newValue) {
		deliverypriority = newValue;
    }

	public String getGeliveryCondition() {
    	return deliverypriority;
    }
	
	public void setPaymentVoucherNbr(int newValue) {
		paymentvouchernbr = newValue;
    }

	public int getPaymentVoucherNbr() {
    	return paymentvouchernbr;
    }
			
	static String InsertItemsReq(int itemreqrecordidnbr, int itemidnbr, String itemdescription, 
	 		int reqnbr, int po_nbr, String sellerinvoicenbr, String rec_rpt_nbr, int selleridnbr, int qtyitemrequested, 
	 		String acctnbrcharged, String deliverypriority, int qtydelivered, String deliverycondition, int paymentvouchernbr) {

			String sql = "insert into Itemsrequisitioned values " 
						+ "(" + itemreqrecordidnbr + ",\'" + itemidnbr + "\',\'" + itemdescription + "\',\'" + reqnbr + "\',\'" 
						+ po_nbr + "\',\'" + sellerinvoicenbr + "\',\'" + rec_rpt_nbr + "\',\'" + selleridnbr + "\',\'"   
						+ qtyitemrequested + "\',\'" + acctnbrcharged + "\',\'" +  deliverypriority + "\',\'" 
						+ qtydelivered + "\',\'" + deliverycondition + "\',\'" + paymentvouchernbr + "\')";
			
			return sql;		
		} 	 

	
}
