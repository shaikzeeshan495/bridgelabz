/******************************************************************************
 *  Purpose:	Stock report using json
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class stockReport {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		StockPortfolio stock=new StockPortfolio();
		JSONParser parser = new JSONParser();
		File file=new File("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/Shares.json");
		Object obj=parser.parse(new FileReader(file));
		stock.calculationStock(obj);

	}

}
