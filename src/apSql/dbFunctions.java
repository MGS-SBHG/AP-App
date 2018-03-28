package apSql;

public class dbFunctions {
  		
	//DisplayAll()
	static String DisplayAll(String table){
	    String strSelect = "select * from " + table + ";";    
	    System.out.println("The SQL query is: " + strSelect);  // Echo For debugging
	    return strSelect;	
	    }
	                               
    
	   /* 
	    * // Step 3: Execute a SQL SELECT query, the query result
	      //  is returned in a "ResultSet" object.
	      String strSelect = "select title, price, qty from books";
	      System.out.println("The SQL query is: " + strSelect); // Echo For debugging
	      System.out.println();

	      ResultSet rset = stmt.executeQuery(strSelect);

	      // Step 4: Process the ResultSet by scrolling the cursor forward via next().
	      //  For each row, retrieve the contents of the cells with getXxx(columnName).
	      System.out.println("The records selected are:");
	      int rowCount = 0;
	      while(rset.next()) {   // Move the cursor to the next row
	         String title = rset.getString("title");
	         double price = rset.getDouble("price");
	         int    qty   = rset.getInt("qty");
	         System.out.println(title + ", " + price + ", " + qty);
	         ++rowCount;
	      }
	      System.out.println("Total number of records = " + rowCount);
	    */   

	

	
// ascend / descend
	// SELECT columns FROM table ORDER BY columns;
	
	// SELECT columns FROM table ORDER BY columns DESC;

	
}
