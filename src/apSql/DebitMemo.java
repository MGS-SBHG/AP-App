package apSql;

public class DebitMemo {
	
	int debitmemonbr;
	String sellerinvoicenbr; 
	int selleridnbr; 
	String prepdate; 
	String authorizedby; 
	float debit_memo_amount;
	   
	
	static String InsertDebitMemo(int debitmemonbr, String sellerinvoicenbr, int selleridnbr, 
	 		String prepdate, String authorizedby, float debit_memo_amount) {

			String sql = "insert into debitmemo_hdr values " 
						+ "(" + debitmemonbr + ",\'" + sellerinvoicenbr + "\',\'" + selleridnbr + "\',\'" + prepdate + "\',\'" 
						+ authorizedby + "\',\'" + debit_memo_amount + "\')";
			
			return sql;		
		}
	
	public void setDebitMemoNbr(int newValue) {
		debitmemonbr = newValue;
    }

    public int getDebitMemoNbr() {
    	return debitmemonbr;
    }
    
    public void setSellerInvoiceNbr(String newValue) {
    	sellerinvoicenbr = newValue;
    }

    public String getSellerInvoiceNbr() {
    	return sellerinvoicenbr;
    }
	
    public void setSellerIdNbr(int newValue) {
    	selleridnbr = newValue;
    }

    public int getSellerIdNbr() {
    	return selleridnbr;
    }

    public void setPrepdate(String newValue) {
    	prepdate = newValue;
    }

    public String getPrepdate() {
    	return prepdate;
    }

    public void setAuthorizedBy(String newValue) {
    	authorizedby = newValue;
    }

    public String getAuthorizedBy() {
    	return authorizedby;
    }

    public void setDebitMemoAmount(float newValue) {
    	debit_memo_amount = newValue;
    }

    public float getDebitMemoAmount() {
    	return debit_memo_amount;
    }
    
}
