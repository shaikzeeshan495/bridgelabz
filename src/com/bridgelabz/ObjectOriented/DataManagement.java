/******************************************************************************
 *  Purpose:	DataManagement using json
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   10-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

public class DataManagement {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		File file=new File("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/DataManagement.json");
		Object obj=parser.parse(new FileReader(file));
		JSONObject jsonObject = (JSONObject) obj;
		Utility.inventory(jsonObject);
	}

}
