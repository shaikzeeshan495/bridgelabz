package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		File file=new File("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/example.json");
		Object obj=parser.parse(new FileReader(file));
		JSONObject jsonObject = (JSONObject) obj;
		String name = (String) jsonObject.get("Name");
        String author = (String) jsonObject.get("Age");
        JSONArray skills = (JSONArray) jsonObject.get("Skills");
        System.out.println("Name: " + name);
        System.out.println("Age: " + author);
        System.out.println("\nSkills: ");
        Iterator<String> iterator = skills.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
