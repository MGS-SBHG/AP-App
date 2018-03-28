package apSql;

public class OpenPOHdr {

	//fields\attributes
	
	int po_nbr;	
	int selleridnbr;
	int itemidnbr;
	String itemdescription; 
	int reqnbr;
	String purchasemgrname; 
	String purchasemgrstreet; 
	String purchasemgrcity; 
	String purchasemgrstate; 
	int purchasemgrzip;
	int purchasemgrphonenbr;
	String buyerdeliverystreet;
	String buyerdeliverycity;
	String buyerdeliverystate; 
	int buyerdeliveryzip;
	String buyerinvoicestreet;
	String buyerinvoicecity;
	String buyerinvoicestate; 
	int buyerinvoicezip; 
	String specialinstructions;
	
	//methods
	public void setPO_Nbr(int newValue) {
    	po_nbr = newValue;
    }

    public int getPO_Nbr() {
    	return po_nbr;
    } 
	 
	public void setSellerIdNbr(int newValue) {
    	selleridnbr = newValue;
    }

    public int getSellerIdNbr() {
    	return selleridnbr;
    } 
	
    
	public void setItemIdNbr(int newValue) {
    	itemidnbr = newValue;
    }

    public int getItemIdNbr() {
    	return itemidnbr;
    }
	
    
    public void setItemDescription(String newValue) {
    	itemdescription = newValue;
    }

    public String getItemDescription() {
    	return itemdescription;
    }  
     
     
   
    public void setReqNbr(int newValue) {
    	itemidnbr = newValue;
    }

    public int getReqNbr() {
    	return itemidnbr;
    }
    
    
	public void setPurchaseMgrName(String newValue) {
    	purchasemgrname = newValue;
    }

    public String getPurchaseMgrName() {
    	return purchasemgrname;
    }  
    
    
	public void setPurchaseMgrStreet(String newValue) {
    	purchasemgrstreet = newValue;
    }

    public String getPurchaseMgrStreet() {
    	return purchasemgrstreet;
    }
	 
    
    public void setPurchaseMgrCity(String newValue) {
    	purchasemgrcity = newValue;
    }

    public String getPurchaseMgrCity() {
    	return purchasemgrcity;
    } 
      
    
    public void setPurchaseMgrState(String newValue) {
    	purchasemgrstate = newValue;
    }

    public String getPurchaseMgrState() {
    	return purchasemgrstate;
    } 
    
    
	public void setPurchaseMgrZip(int newValue) {
    	purchasemgrzip = newValue;
    }

    public int getPurchaseMgrZip() {
    	return purchasemgrzip;
    } 
    
    
	public void setPurchaseMgrPhoneNbr(int newValue) {
    	purchasemgrphonenbr = newValue;
    }

    public int getPurchaseMgrPhoneNbr() {
    	return purchasemgrphonenbr;
    } 
    
    
    public void setBuyerDeliveryStreet(String newValue) {
    	buyerdeliverystreet = newValue;
    }

    public String getBuyerDeliveryStreet() {
    	return buyerdeliverystreet;
    }
	 
    
    public void setBuyerDeliveryCity(String newValue) {
    	buyerdeliverycity = newValue;
    }

    public String getBuyerDeliveryCity() {
    	return buyerdeliverycity;
    } 
    
            
    public void setBuyerDeliveryState(String newValue) {
    	buyerdeliverystate = newValue;
    }

    public String getBuyerDeliveryState() {
    	return buyerdeliverystate;
    } 
    
    
	public void setBuyerDeliveryZip(int newValue) {
    	buyerdeliveryzip = newValue;
    }

    public int getBuyerDeliveryZip() {
    	return buyerdeliveryzip;
    } 


	
	public void setbuyerinvoiceStreet(String newValue) {
    	buyerinvoicestreet = newValue;
    }

    public String getbuyerinvoiceStreet() {
    	return buyerinvoicestreet;
    }
	 
    
    public void setbuyerinvoiceCity(String newValue) {
    	buyerinvoicecity = newValue;
    }

    public String getbuyerinvoiceCity() {
    	return buyerinvoicecity;
    } 
      
    
    public void setbuyerinvoiceState(String newValue) {
    	buyerinvoicestate = newValue;
    }

    public String getbuyerinvoiceState() {
    	return buyerinvoicestate;
    } 
    
    
	public void setbuyerinvoiceZip(int newValue) {
    	buyerinvoicezip = newValue;
    }

    public int getbuyerinvoiceZip() {
    	return buyerinvoicezip;
    } 

	
	public void setspecialinstructions(String newValue) {
    	specialinstructions = newValue;
    }

    public String specialinstructions() {
    	return specialinstructions;
    }  
	
	
	static String InsertOpenPOHdr(int po_nbr,int selleridnbr,int itemidnbr,String itemdescription, int reqnbr,String purchasemgrname, 
			String purchasemgrstreet, String purchasemgrcity, String purchasemgrstate, int purchasemgrzip,
			int purchasemgrphonenbr,String buyerdeliverystreet,String buyerdeliverycity,String buyerdeliverystate, 
			int buyerdeliveryzip,String buyerinvoicestreet,String buyerinvoicecity,String buyerinvoicestate, 
			int buyerinvoicezip, String specialinstructions) {

	String sql = "insert into OpenPO_hdr values " 
	+ "(" + po_nbr + ",\'" + selleridnbr + "\',\'" + itemidnbr + "\',\'" + itemdescription + "\',\'" 
	+ reqnbr + "\',\'" + purchasemgrname + "\',\'" + purchasemgrstreet + "\',\'" + purchasemgrcity + "\',\'"   
	+ purchasemgrzip + "\',\'" + buyerdeliveryzip + "\',\'" +  buyerinvoicestreet + "\',\'" 
	+ buyerinvoicecity + "\',\'" + buyerinvoicestate + "\',\'" 
	+ buyerinvoicezip + "\',\'" + specialinstructions + "\')";

	return sql;		
	}

}
