package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.JSONParser;

public class ExampleAddress {
	public static void main(String[] args) {
		ObjectMapper objmap=new ObjectMapper();
		JSONParser parser = new JSONParser();
	//	String str="{\"brand\" : \"Apple\", \"colour\" : \"red\",\"price\":99999}";
		try {
			File file = new File("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/Example2.json");
			FileReader rd = new FileReader(file);
			
/*			Object obj=parser.parse(new FileReader(file));
			JSONArray jsonObject = (JSONArray) obj;
			System.out.println(jsonObject);	
			System.out.println("Enter brand :");
			String str=Utility.inputString();
			for(int i=0;i<jsonObject.size();i++){
				JSONObject obj1 = (JSONObject) jsonObject.get(i);
				if(obj1.get("type").equals(str)){
					System.out.println(obj1.get("obj"));
				}
						
			}	*/
			Mobile mob=objmap.readValue(file, Mobile.class);
			System.out.println("Mobile brand	: "+mob.getBrand());
	//		System.out.println("Mobile colour	: "+mob.getColour());
	//		System.out.println("Mobile price	: "+mob.getPrice());
			mob.setBrand("lenovo");
			objmap.writeValue(
				    new FileOutputStream("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/Example2.json"), mob);
			System.out.println("Mobile brand	: "+mob.getBrand());
			System.out.println("Mobile colour	: "+mob.getColour());
			System.out.println("Mobile price	: "+mob.getPrice());	
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
}
