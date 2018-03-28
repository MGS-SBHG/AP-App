package apSql;

public class ItemsApproved {
	
	// attributes
	int itemidnbr; 
	int selleridnbr; 
	String itemname; 
	String itemdescription; 
	int itemorderqty; 
	Float itempriceperunit; 
	String itempurchagrmntnbr; 
	String itemdatelastreviewed;
	
	//methods
	static String InsertApprvdItems(int itemidnbr, int selleridnbr, String itemname, String itemdescription, int itemorderqty, 
			Float itempriceperunit, String itempurchagrmntnbr, String itemdatelastreviewed) {

			String sql = "insert into items_approved_for_purchase values " 
						+ "(" + itemidnbr + ",\'" + selleridnbr + "\',\'" + itemname + "\',\'" + itemdescription + "\',\'" 
						+ itemorderqty + "\',\'" + itempriceperunit + "\',\'" + itempurchagrmntnbr
						+ "\',\'" + itemdatelastreviewed + "\')";
			
			return sql;		
		}
	
    public void setItemIdNbr(int newValue) {
    	itemidnbr = newValue;
    }

    public int getItemidNbr() {
    	return itemidnbr;
    }

    public void setItemName(String newValue) {
    	itemname = newValue;
    }

    public String getItemName() {
    	return itemname;
    }
    
    public void setItemDescription(String newValue) {
    	itemdescription = newValue;
    }

    public String getItemDescription() {
    	return itemdescription;
    }

    public void setItemOrderQty(int newValue) {
    	itemorderqty = newValue;
    }
    
    public int getItemOrderQty() {
    	return itemorderqty;
    }

    public void setItemPricePerUnit(Float newValue) {
    	itempriceperunit = newValue;
    }
    
    public Float getItemPricePerUnit() {
    	return itempriceperunit;
    }
    
    public void setSellerIdNbr(int newValue) {
    	selleridnbr = newValue;
    }
    
    public int getSellerIdNbr() {
    	return selleridnbr;
    }

    
    public void setitempurchagrmntnbr(String newValue) {
    	itempurchagrmntnbr = newValue;
    }

    public String getitempurchagrmntnbr() {
    	return itempurchagrmntnbr;
    }
    
    
    public void setitemdatelastreviewed(String newValue) {
    	itemdatelastreviewed = newValue;
    }

    public String getitemdatelastreviewed() {
    	return itemdatelastreviewed;
    }
    
    
 
    
}
