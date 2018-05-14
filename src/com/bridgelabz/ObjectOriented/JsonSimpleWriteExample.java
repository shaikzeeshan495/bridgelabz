package com.bridgelabz.ObjectOriented;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.utility.Utility;

public class JsonSimpleWriteExample {
	
	public static List<String> list3 = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		for(int j=0;j<2;j++)
        {
		System.out.println("enter type");
		String typeStr=Utility.inputString();
		JSONArray ja = new JSONArray();
        for(int i=0;i<2;i++)
        {
		JSONObject obj = new JSONObject();
		System.out.println("enter name");
		String str=Utility.inputString();
       obj.put("name", str);
       System.out.println("enter price");
		String price=Utility.inputString();
       obj.put("price", price);
       System.out.println("enter weight");
		String value=Utility.inputString();
       obj.put("weight", value);
       
       ja.add(obj);
        }
        JSONObject subobj=new JSONObject();
        subobj.put(typeStr,ja);
        JSONArray mainArray = new JSONArray();
        mainArray.add(subobj);
        JSONObject mainobj=new JSONObject();
        mainobj.put("Inventory", mainArray);
        System.out.println(mainobj.toJSONString());
        }
 //       System.out.println(subobj.toJSONString());
/*        JSONArray mainArray = new JSONArray();
        mainArray.add(subobj);
        JSONObject mainobj=new JSONObject();
        mainobj.put("Inventory", mainArray);
        System.out.println(mainobj.toJSONString());	*/
        
    }


}
