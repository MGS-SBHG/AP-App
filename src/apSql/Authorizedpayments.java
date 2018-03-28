package apSql;

public class Authorizedpayments {
	
	//fields
	int paymentvouchernbr;
	String voucherprepdate; 
	String voucherapproveperson; 
	Float paymentamount; 
	int paymentchecknbr; 
	String checkprepdate;
	
	//methods
	
	
 	static String InsertAuthorizedpayments(int paymentvouchernbr, String voucherprepdate, String voucherapproveperson, 
 	 		Float paymentamount, int paymentchecknbr, String checkprepdate) {

 			String sql = "insert into Authorizedpayments_hdr values " 
 						+ "(" + paymentvouchernbr + ",\'" + voucherprepdate + "\',\'" + voucherapproveperson + "\',\'" + paymentamount + "\',\'" 
 						+ paymentchecknbr + "\',\'" + checkprepdate + "\')";
 			
 			return sql;		
 		}

	public void setPaymentVoucherNbr(int newValue) {
		paymentvouchernbr = newValue;
    }

    public int getPaymentVoucherNbr() {
    	return paymentvouchernbr;
    }

    public void setVoucherPrepDate(String newValue) {
    	voucherprepdate = newValue;
    }

    public String getVoucherPrepDate() {
    	return voucherprepdate;
    }
    
    public void setVoucherApprovePerson(String newValue) {
    	voucherapproveperson = newValue;
    }

    public String getVoucherApprovePerson() {
    	return voucherapproveperson;
    }
    
    public void setPaymentAmount(Float newValue) {
    	paymentamount = newValue;
    }

    public Float getPaymentAmount() {
    	return paymentamount;
    }
    
    public void setPaymentCheckNbr(int newValue) {
    	paymentchecknbr = newValue;
    }

    public int getPaymentCheckNbr() {
    	return paymentchecknbr;
    }
    
    public void setCheckPrepDate(String newValue) {
    	checkprepdate = newValue;
    }

    public String getCheckPrepDate() {
    	return checkprepdate;
    }
 	
}
