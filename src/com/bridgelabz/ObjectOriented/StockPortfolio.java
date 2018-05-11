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
	public void calculationStock(JSONObject jsonObject)
	{
		int InfosysStock=1,jpMorganStock=1,kpitStock=1,sum=0;
		JSONArray Obj1 = (JSONArray) jsonObject.get("Infosys");
		@SuppressWarnings("unchecked")
		Iterator<String> iterator1 = Obj1.iterator();
        while (iterator1.hasNext()) {
        	InfosysStock=InfosysStock*Integer.parseInt(iterator1.next());
        }
        sum=InfosysStock;
        System.out.println("Total price of InfosysStock	:	"+InfosysStock);
        
        JSONArray Obj2 = (JSONArray) jsonObject.get("jpMorgan");
		@SuppressWarnings("unchecked")
		Iterator<String> iterator2 = Obj2.iterator();
        while (iterator2.hasNext()) {
        	jpMorganStock=jpMorganStock*Integer.parseInt(iterator2.next());
        }
        sum=sum+jpMorganStock;
        System.out.println("Total price of jpMorganStock	:	"+jpMorganStock);
        
        JSONArray Obj3 = (JSONArray) jsonObject.get("KPIT");
		@SuppressWarnings("unchecked")
		Iterator<String> iterator3 = Obj3.iterator();
        while (iterator3.hasNext()) {
        	kpitStock=kpitStock*Integer.parseInt(iterator3.next());
        }
        sum=sum+kpitStock;
        System.out.println("Total price of kpitStock	:	"+kpitStock);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Companies Stock price	:	"+sum);
        System.out.println("--------------------------------------------------");
	}

}
