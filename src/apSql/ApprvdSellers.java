package apSql;

public class ApprvdSellers {
	// fields
	public int selleridnbr;
	public String sellername; 
	public String sellerstreet; 
	public String sellercity; 
	public String sellerstate; 
	public String sellerzip;
	public String country; 
	public String sellerphonenbr; 
	public String sellerfaxnbr; 
	public String selleremail; 
	public String sellerwwwsite;
    
    //constructors
	public ApprvdSellers(){
		selleridnbr = 0; 
		sellername  = null;
  	  	sellerstreet = null; 
  	  	sellercity  = null;
  	  	sellerstate  = null;
  	  	sellerzip = null;
        country  = null;
        sellerphonenbr = null; 
        sellerfaxnbr  = null;
        selleremail = null;
        sellerwwwsite = null;		
	}
	
    public ApprvdSellers(int sidnbr, String sname, String sstreet, String scity, String sstate, String szip,
    		String cntry, String sphonenbr, String sfaxnbr, String semail, String swwwsite) {
    	
    	  selleridnbr = sidnbr; 
    	  sellername  = sname;
    	  sellerstreet = sstreet; 
    	  sellercity  = scity;
    	  sellerstate  = sstate;
    	  sellerzip = szip;
          country  = cntry;
          sellerphonenbr = sphonenbr; 
          sellerfaxnbr  = sfaxnbr;
          selleremail = semail;
          sellerwwwsite = swwwsite;    	
    }
    
    // methods
    public String InsertApprvdSellers(){
    		
    		String sql = "insert into Approved_sellers_hdr values " + "(" 
    					+ selleridnbr + ",\'" 
    					+ sellername + "\',\'" 
    					+ sellerstreet + "\',\'" 
    					+ sellercity + "\',\'" 
    					+ sellerstate + "\',\'" 
    					+ sellerzip + "\',\'" 
    					+ country + "\',\'" 
    					+ sellerphonenbr + "\',\'" 
    					+ sellerfaxnbr + "\',\'" 
    					+ selleremail + "\',\'" 
    					+ sellerwwwsite + "\')";
    		
    		return sql; 	   		
    }
    
    public String UpdateApprvdSellers(){
		
    	// "update itemsapprovedforpurchase set itemdatelastreviewed = '2016-05-31' where itemidnbr = 01";
    	
		String sql = "update Approved_sellers_hdr values set " +  
					+ selleridnbr + ",\'" 
					+ sellername + "\',\'" 
					+ sellerstreet + "\',\'" 
					+ sellercity + "\',\'" 
					+ sellerstate + "\',\'" 
					+ sellerzip + "\',\'" 
					+ country + "\',\'" 
					+ sellerphonenbr + "\',\'" 
					+ sellerfaxnbr + "\',\'" 
					+ selleremail + "\',\'" 
					+ sellerwwwsite + "\')";
		
		return sql; 	   		
}
    
    public void setSellerIdNbr(int newValue) {
    	selleridnbr = newValue;
    }

    public int getSellerIdNbr() {
    	return selleridnbr;
    }
    
    public void setSellerName(String newValue) {
    	 sellername = newValue;
    }

    public String getSellerName() {
   	 	return sellername;
   }

   public void setSellerStreet(String newValue) {
    	sellerstreet = newValue;
   }

   public String getSellerStreet() {
  	 	return sellerstreet;
  }
  
   public void setSellerCity(String newValue) {
   	sellercity = newValue;
  }

   public String getSellerCity() {
 	 	return sellercity;
 } 
   
   public void setSellerState(String newValue) {
	   	sellerstate = newValue;
	  }

   public String getSellerState() {
	 	 	return sellerstate;
	 } 

   public void setSellerZip(String newValue) {
	   	sellerzip = newValue;
	  }

   public String getSellerZip() {
	 	 	return sellerzip;
	 } 
   
   public void setSellerCountry(String newValue) {
	   country = newValue;
	  }

   public String getSellerCountry() {
	 	 	return country;
	 } 
   
   public void setSellerPhoneNbr(String newValue) {
	   sellerphonenbr = newValue;
	  }

   public String getSellerPhoneNbr() {
	 	 	return sellerphonenbr;
	 }

   public void setSellerFaxNbr(String newValue) {
	   sellerfaxnbr = newValue;
	  }

   public String getSellerFaxNbr() {
	 	 	return sellerfaxnbr;
	 }

   public void setSellerEmail(String newValue) {
	   selleremail = newValue;
	  }

   public String getSellerEmail() {
	 	 	return selleremail;
	 }

   public void setSellerwwwsite(String newValue) {
	   sellerwwwsite = newValue;
	  }

   public String getSellerwwwsite() {
	 	 	return sellerwwwsite;
	 }          
}
