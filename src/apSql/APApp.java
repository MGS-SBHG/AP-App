package apSql;

import java.sql.*;  // Use classes in java.sql package

//JDK 7 and above
public class APApp{
	
  public static void main(String[] args) {  
	
   try (
		   	// Allocate a database "Connection" object
		      Connection conn = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/accountspayable?useSSL=false", "root", "M0hMy5QL6752!"); // MySQL

		    // Allocate a "Statement" object in the Connection
		      Statement stmt = conn.createStatement();
   )//end try block
   
   { // Block statements
	   
	    String table = "Approved_sellers_hdr";   	   	   	   	   	 	   
		String dbFunction = "delete";
		String sqlInsert = " ";

		switch(dbFunction){
			case "insert":
				if (table == "Approved_sellers_hdr"){					

					//ApprvdSellers vendor = new ApprvdSellers(10, "Seagate Technology", "920 Disc Dr.", 
					//	"Scotts Valley", "CA", "95066", null, null, null, null, null);
					
					
					ApprvdSellers vendor = new ApprvdSellers();
					vendor.setSellerIdNbr(9);
					vendor.setSellerName("MGS Technology");
					vendor.setSellerStreet("123 Main St.");
					vendor.setSellerCity("Man");
					vendor.setSellerState("NJ");
					vendor.setSellerZip("012345");
					
					sqlInsert = vendor.InsertApprvdSellers();
					
					System.out.println(sqlInsert);
					 					
				}
				
				if (table == "items_approved_for_purchase"){
					sqlInsert = ItemsApproved.InsertApprvdItems(
	    			  01, 01, "ASUS GTX1080-8G graphics card", 
				      "NVIDIA GeForce GX 1080 PCI Express 3.0 Bus GDDR5x 8GB GPU Base/Boost Clock 1607/1733 Mhz DVI HDMI DP HDCP  10.5(26.67)x4.376(11.12)x1.5(3.81)in(cm)", 
				      20, (float) 699.99, null, "2016-05-31");   
		  		}
		
				

	        System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
	        int countInserted = stmt.executeUpdate(sqlInsert);
	        System.out.println(countInserted + " records inserted.\n");      		  
	    	break;
	    	
	    	case "update":
	    		//update records	   
	          
	        	//String strUpdate = 
	    		// 
	        	
	    		//System.out.println("The SQL query is: " + strUpdate);  // Echo for debugging
	        
	        	//int countUpdated = stmt.executeUpdate(strUpdate);
	        	//System.out.println(countUpdated + " records affected.");    
	    	
	    	break;
	    	
	    	case "delete":
	   	    		    	
	    	//delete records
	    	      	    
	    	//      String sqlDelete = "delete from itemsapprovedforpurchase where itemidnbr>=18 and itemidnbr<23";
	    	//      System.out.println("The SQL query is: " + sqlDelete);  // Echo for debugging
	    	//      int countDeleted = stmt.executeUpdate(sqlDelete);
	    	//      System.out.println(countDeleted + " records deleted.\n");
	    	
	 		break;
	 		
	   
   			case "select":
	    	break;			    	
	    	
	    }	    
	    	    
	  	  
	   ResultSet rset = stmt.executeQuery(dbFunctions.DisplayAll(table));
	   
	   switch(table) {	     		
	            case "Approved_sellers_hdr":     		         	   
	         	   while(rset.next()) { // Move the cursor to the next row
	         	       System.out.println(
	         	                 rset.getInt("selleridnbr") + ", "
	         	               + rset.getString("sellername") + ", "
	         	               + rset.getString("sellerstreet") + ", "
	         	               + rset.getString("sellercity") + ", "
	         	               + rset.getString("sellerstate") + ", "
	         	               + rset.getString("sellerzip") + ", "
	         	               + rset.getString("country") + ", "
	         	               + rset.getString("sellerphonenbr") + ", "
	         	               + rset.getString("sellerfaxnbr") + ", "
	         	               + rset.getString("selleremail") + ", "
	         	               + rset.getString("sellerwwwsite")
	         	      		 );//print
	         	    }//while	         		
	            break;
	            
	            case "items_approved_for_purchase":	            	 	         	    
	         	    while(rset.next()) {   // Move the cursor to the next row
	         	       System.out.println(
	         	      		   rset.getInt("itemidnbr") + ", "
	         	               + rset.getInt("selleridnbr") + ", "
	         	               + rset.getString("itemname") + ", "
	         	               + rset.getString("itemdescription") + ", "
	         	               + rset.getInt("itemorderqty") + ", "
	         	               + rset.getFloat("itempriceperunit") + ", "
	         	               + rset.getString("itempurchagrmntnbr") + ", "
	         	               + rset.getDate("itemdatelastreviewed")                 
	         	      		 );
	         	    }
	            break;
	            
	            case "Authorizedpayments_hdr": 	            		        	    	     	        		
	        	    while(rset.next()) {   // Move the cursor to the next row
	        	       System.out.println(
	        			   		rset.getInt("paymentvouchernbr") + ", "
	        	               + rset.getDate("voucherprepdate") + ", "        	               	            
	        	               + rset.getString("voucherapproveperson") + ", "	               
	        	               + rset.getFloat("paymentamount") + ", "	               
	        	               + rset.getInt("paymentchecknbr") + ", "	               
	        	               + rset.getDate("checkprepdate")
	        	             );
	        	    }
	            break;
	            
	            case "debitmemo_hdr":
	        	    while(rset.next()) {   // Move the cursor to the next row
	        	       System.out.println(
	        			   		 rset.getInt("debitmemonbr") + ", "
	        	    		   + rset.getInt("sellerinvoicenbr") + ", "
	        	    		   + rset.getInt("selleridnbr") + ", "
	        	               + rset.getDate("prepdate") + ", "        	               	            
	        	               + rset.getString("authorizedby") + ", "	               
	        	               + rset.getFloat("debit_memo_amount")
	        	             );
	        	    }	   	   
	            break;
	            
	            case "Itemsrequisitioned":
	         	    while(rset.next()) {   // Move the cursor to the next row
	         	       System.out.println(
	         			   		rset.getInt("itemreqrecordidnbr") + ", "
	         	    			+ rset.getInt("itemidnbr") + ", "
	         	    			+ rset.getInt("selleridnbr") + ", "
	         	    			+ rset.getString("itemdescription") + ", "
	         	    			+ rset.getInt("reqnbr") + ", "
	         					+ rset.getInt("po_nbr") + ", "
	         					+ rset.getString("sellerinvoicenbr") + ", "
	         					+ rset.getString("rec_rpt_nbr") + ", "
	         					+ rset.getInt("selleridnbr") + ", "					
	         					+ rset.getInt("qtyitemrequested") + ", "
	           	                + rset.getString("acctnbrcharged") + ", "	               
	         					+ rset.getString("deliverypriority") + ", "					
	         					+ rset.getInt("qtydelivered") + ", "
	         					+ rset.getString("deliverycondition") + ", "
	         					+ rset.getInt("paymentvouchernbr")					
	         	             );
	         	    }
	            break;
	            
	            case "Materialreq_hdr":	        	     	    
	        	    while(rset.next()) {   // Move the cursor to the next row
	        	       System.out.println(
	        			   		rset.getInt("reqnbr") + ", "
	        			   		+ rset.getString("reqdeptidcode") + ", "
	        			   		+ rset.getDate("prepdate") + ", "
	        			   		+ rset.getString("authapprovalcode") + ", "
	        			   		+ rset.getDate("approveddate")			   		
	        	             );
	        	    }	
	            break;
	            
	            case "OpenPO_hdr":
	         	    while(rset.next()) {   // Move the cursor to the next row
	         	       System.out.println(
	         			   		rset.getInt("po_nbr") + ", "
	         			   		+ rset.getInt("selleridnbr") + ", "
	         			   		
	         			   		+ rset.getString("purchasemgrname") + ", "
	         			   		+ rset.getString("purchasemgrstreet") + ", "
	         			   		+ rset.getString("purchasemgrstreet") + ", "
	         			   		+ rset.getString("purchasemgrcity") + ", "
	         			   		+ rset.getString("purchasemgrstate") + ", "			   		
	         			   		+ rset.getInt("purchasemgrzip") + ", "
	         			   		+ rset.getInt("purchasemgrphonenbr") + ", "
	         			   		
	         			   		+ rset.getString("buyerdeliverystreet") + ", "
	         			   		+ rset.getString("buyerdeliverycity") + ", "
	         			   		+ rset.getString("buyerdeliverystate") + ", "
	         			   		+ rset.getInt("buyerdeliveryzip") + ", "
	         			   		
	         			   		+ rset.getString("buyerinvoicestreet") + ", "
	         			   		+ rset.getString("buyerinvoicecity") + ", "
	         			   		+ rset.getString("buyerinvocestate") + ", "			   		
	         			   		+ rset.getInt("buyerinvoicezip") + ", "

	         			   		+ rset.getString("specialinstructions") + ", "
	         	             );
	         	    }			    

		        break;
		        
	            case "Receivingrpt_hdr":
	        	    while(rset.next()) {   // Move the cursor to the next row
	        	       System.out.println(
	        			   		rset.getInt("rec_rpt_nbr") + ", "
	        			   		+ rset.getInt("po_nbr") + ", "
	        			   		+ rset.getString("shippersellershipmentidnbr") + ", "
	        			   		+ rset.getDate("shipmentrecvddate")   		
	        	             );
	        	    	}			    

		        break;
		        
	            case "Sellerinvoice_hdr":
	        	    while(rset.next()) {   // Move the cursor to the next row
	        	       System.out.println(
	        			   		rset.getInt("invoice_id") + ", "
	        			   		+ rset.getInt("selleridnbr") + ", "
	        			   		+ rset.getString("sellerinvoicenbr") + ", "
	        			   		+ rset.getDate("recvddate") + ", "
	        			   		+ rset.getFloat("grossamountbilled") + ", "
	        			   		+ rset.getFloat("taxdue") + ", "
	        			   		+ rset.getFloat("shippingchargesdue") + ", "
	        			   		+ rset.getFloat("debitmemoamount") + ", "
	        			   		+ rset.getFloat("promptpaymentdiscount") + ", "
	        			   		+ rset.getDate("promptpaymentdiscountexpiredate") + ", "
	        			   		+ rset.getFloat("indicatednetamountdue")			   		
	        	             );
	        	    }			    
	        	    break;		            
	        };
	   
   } catch(SQLException ex) {
      ex.printStackTrace();
   } // catch block
   
   // Step 5: Close the resources - Done automatically by try-with-resources
}
}
