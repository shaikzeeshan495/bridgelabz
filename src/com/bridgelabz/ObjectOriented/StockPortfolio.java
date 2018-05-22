/******************************************************************************
 *  Purpose:	Stock report using json
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockPortfolio {
	public void calculationStock(Object obj)
	{
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray companyStocks=(JSONArray) jsonObject.get("Stocks"); 
		Iterator<?> iterator=companyStocks.iterator();
		while(iterator.hasNext())
		{
			
			 JSONObject jsonObject1 = (JSONObject) iterator.next();
			 String name = (String) jsonObject1.get("Name");
			 long totalStocks =  (long) jsonObject1.get("stocks");
			 long pricePerStock =  (long) jsonObject1.get("price");
			 long total=totalStocks*pricePerStock;
			 System.out.println("Name : "+name);
			 System.out.println("totalStocks : "+totalStocks);
			 System.out.println("pricePerStock : "+pricePerStock);
			 System.out.println("Total : "+total+"\n");
		}	
	
	}

}
