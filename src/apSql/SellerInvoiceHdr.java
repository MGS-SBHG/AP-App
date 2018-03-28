package apSql;

public class SellerInvoiceHdr {

	//attributes fields
	int invoice_id; int selleridnbr; String sellerinvoicenbr; String recvddate;
	float grossamountbilled; float taxdue; float shippingchargesdue; float debitmemoamount; float promptpaymentdiscount;
	String promptpaymentdiscountexpiredate; float indicatednetamountdue;
		
    // methods
    public void setInvoiceId(int newValue) {
    	invoice_id = newValue;
    }
    
    public int getInvoiceId() {
    	return invoice_id;
    }

    
    public void setSellerIdNbr(int newValue) {
    	selleridnbr = newValue;
    }
    
    public int getSellerIdNbr() {
    	return selleridnbr;
    }

    
    public void setSellerInvoiceNbr(String newValue) {
    	sellerinvoicenbr = newValue;
   }

    public String getSellerInvoiceNbr() {
  	 	return sellerinvoicenbr;
  }
    

    public void setRecvdDate(String newValue) {
    	recvddate = newValue;
    }

	public String getRecvdDate() {
    	return recvddate;
    }
	

    public void setGrossAmountBilled(Float newValue) {
    	grossamountbilled = newValue;
    }

    public Float getGrossAmountBilled() {
    	return grossamountbilled;
    }
    
    
    public void setTaxDue(Float newValue) {
    	taxdue = newValue;
    }

    public Float getTaxDue() {
    	return taxdue;
    }    
	
    
    public void setShippingChargesDue(Float newValue) {
    	shippingchargesdue = newValue;
    }

    public Float getShippingChargesDue() {
    	return shippingchargesdue;
    }
    
    
    public void setdebitmemoamount(Float newValue) {
    	debitmemoamount = newValue;
    }

    public Float getdebitmemoamount() {
    	return debitmemoamount;
    }
    
    
    public void setpromptpaymentdiscount(Float newValue) {
    	promptpaymentdiscount = newValue;
    }

    public Float getpromptpaymentdiscount() {
    	return promptpaymentdiscount;
    }
    
    
    public void setPromptPaymentDiscountExpireDate(String newValue) {
    	promptpaymentdiscountexpiredate = newValue;
    }

	public String getPromptPaymentDiscountExpireDate() {
    	return promptpaymentdiscountexpiredate;
    }    
    
	
    public void setIndicatedNetAmountDue(Float newValue) {
    	indicatednetamountdue = newValue;
    }

    public Float getIndicatedNetAmountDue() {
    	return indicatednetamountdue;
    }
	
    
	static String InsertSellerInvoiceHdr(int invoice_id, int selleridnbr, String sellerinvoicenbr, String recvddate,
			float grossamountbilled, float taxdue, float shippingchargesdue, float debitmemoamount, float promptpaymentdiscount,
			String promptpaymentdiscountexpiredate, float indicatednetamountdue) {
					String sql = "insert into Sellerinvoice_hdr values " 
								+ "(" + invoice_id + ",\'" 
								+ selleridnbr + "\',\'" 
								+ sellerinvoicenbr + "\',\'" 
								+ recvddate + "\',\'"
								+ grossamountbilled + "\',\'"
								+ taxdue + "\',\'"
								+ shippingchargesdue + "\',\'"
								+ debitmemoamount + "\',\'"
								+ promptpaymentdiscount + "\',\'"
								+ promptpaymentdiscountexpiredate + "\',\'"
								+ indicatednetamountdue + "\')";
					
					return sql;		
			} 	 
	
}
