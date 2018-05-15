package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.Utility;

public class dataManagementImplementation {
	
	public static List<Product> list = new ArrayList<Product>();
	ObjectMapper mapper = new ObjectMapper();
	public List<Product> add(String type) {
		list.add(addUser(type));
		for (Product P : list) {
			System.out.println(P.toString());
		}
		return list;
	}
	
	private Product addUser(String type) {
		Product product = new Product();
		product.setType(type);
		System.out.println("Enter type");
		product.setName(Utility.inputString());
		System.out.println("Enter price");
		product.setPrice(Utility.inputInteger());
		System.out.println("Enter weight");
		product.setWeight(Utility.inputInteger());
		return product;
	}
	
	public void save() {
		try {
			mapper.writeValue(new File("/home/bridgeit/zeeshan/src/com/bridgelabz/ObjectOriented/jsonFiles/inventory.json"), list);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Calculation() {
		System.out.println("\n\t\t\tDisplaying Data");
		String rice="rice";
		String pulses="pulses";
		String wheat="wheat";
		int totalRicePrice=0,totalPulsesPrice=0,totalWheatPrice=0,sum=0;
		for (Product P : list) {
			if (rice.equals(P.getType())) {
				sum=0;
				sum=P.getPrice()*P.getWeight();
				totalRicePrice=totalRicePrice+sum;
			}	else if(pulses.equals(P.getType()))
			{
				sum=0;
				sum=P.getPrice()*P.getWeight();
				totalPulsesPrice=totalPulsesPrice+sum;	
			} else if(wheat.equals(P.getType()))
			{
				sum=0;
				sum=P.getPrice()*P.getWeight();
				totalWheatPrice=totalWheatPrice+sum;
			}
		}
		
		System.out.println("total price of rice :"+totalRicePrice);
		System.out.println("total price of wheat : "+totalWheatPrice);
		System.out.println("total price  of pulses :"+totalPulsesPrice);
		
	}

}
