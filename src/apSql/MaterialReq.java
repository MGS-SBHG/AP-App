package apSql;

public class MaterialReq {

	//attributes
	int reqnbr; 
	String reqdeptidcode; 
	String prepdate; 
	String authapprovalcode; 
	String approveddate;
	
	
	//methods
    public void setReqNbr(int newValue) {
    	reqnbr = newValue;
    }

    public int getReqNbr() {
    	return reqnbr;
    }

    
    public void setReqReqDeptIdCode(String newValue) {
    	reqdeptidcode = newValue;
    }

    public String getReqReqDeptIdCode() {
    	return reqdeptidcode;
    }

    public void setPrepDate(String newValue) {
    	prepdate = newValue;
    }

    public String getPrepDate() {
    	return prepdate;
    }
    
    public void setAuthApprovalCode(String newValue) {
    	authapprovalcode = newValue;
    }

    public String getAuthApprovalCode() {
    	return authapprovalcode;
    }
    
    public void setApprovedDate(String newValue) {
    	approveddate = newValue;
    }

    public String getApprovedDate() {
    	return approveddate;
    }
	
	static String InsertMaterialReq(int reqnbr, String reqdeptidcode, String prepdate, 
		 		String authapprovalcode, String approveddate) {

				String sql = "insert into Materialreq_hdr values " 
							+ "(" + reqnbr + ",\'" + reqdeptidcode + "\',\'" + prepdate + "\',\'" + authapprovalcode + "\',\'" 
							+ approveddate + "\')";
				
				return sql;		
			} 	 

}
