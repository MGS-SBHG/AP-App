package apSql;

public class ReceivingRptHdr {

	int rec_rpt_nbr;
	int po_nbr;
	String shippersellershipmentidnbr;
	String shipmentrecvddate;
	
	
	//methods	
	public void setRecRptNbr(int newValue) {
			rec_rpt_nbr = newValue;
    }

	public int getRecRptNbr() {
    	return rec_rpt_nbr;
    } 
	
	public void setPO_Nbr(int newValue) {
	    	po_nbr = newValue;
	    }

	public int getPO_Nbr() {
	    	return po_nbr;
	    } 
		 
	public void setShipperSellerShipmentdNbr(String newValue) {
		shippersellershipmentidnbr = newValue;
    }

	public String getShipperSellerShipmentdNbr() {
    	return shippersellershipmentidnbr;
    }
	
	public void setShipmentRecvdDate(String newValue) {
		shipmentrecvddate = newValue;
    }

	public String getShipmentRecvdDate() {
    	return shipmentrecvddate;
    }
	
	
	static String InsertReceivingRptHdr(int rec_rpt_nbr, int po_nbr, String shippersellershipmentidnbr, 
	 		String shipmentrecvddate) {

			String sql = "insert into Receivingrpt_hdr values " 
						+ "(" + rec_rpt_nbr + ",\'" + po_nbr + "\',\'" + shippersellershipmentidnbr + "\',\'" + shipmentrecvddate + "\')";
			
			return sql;		
		}
}
