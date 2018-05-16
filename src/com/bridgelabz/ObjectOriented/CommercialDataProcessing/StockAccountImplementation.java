package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Appointment;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Doctor;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Patient;
import com.bridgelabz.utility.Utility;

public class StockAccountImplementation {
	static int COUNT=0;
	ObjectMapper mapper = new ObjectMapper();
	StockAccountImplementation stockImp=new StockAccountImplementation();
	public static List<Companies> listCompanies = new ArrayList<Companies>();
	public static List<Customer> listCustomer = new ArrayList<Customer>();
	/* 
	 * Purpose : Creates new file 
	 */
	public void createCustomer() throws IOException {
		System.out.println("\n\t\t\tEnter the name of address book");
		String StockAccountName = Utility.inputString();
		File file = new File("StockAccount//"+ StockAccountName + ".json");
		if (file.createNewFile()) {
			System.out.println("\n\t\t\tFile is created!");
		} else {
			System.out.println("\n\t\t\tFile already exists.");
		}
	}
	
	/**
	 * @return
	 */
	public List<Companies> addCompany()
	{

		listCompanies.add(addUser());
			for (Companies company : listCompanies) {
				System.out.println(company.toString());
			}
			return listCompanies;
		
	}
	
	
	
	/**
	 * Purpose : Adding information of person and add it in an object.
	 * 
	 * @return object of person with added information in it.
	 */
	private Companies addUser() {
		Companies company = new Companies();
		
		System.out.println("\n\t\t\tEnter Company Name");
		company.setCompanyName(Utility.inputString());
		System.out.println("\n\t\t\tEnter companySymbol");
		company.setCompanySymbol(Utility.inputString());
		System.out.println("\n\t\t\tEnter price of per share");
		company.setSharePrice(Utility.inputInteger());
		System.out.println("\n\t\t\tEnter State");
		company.setTotalShares(Utility.inputInteger());
		Date date = new Date();
		company.setTime(date.toString());
		return company;
	}
	
	/* 
	 * Purpose : add person in person list
	 */
	public List<Customer> addCustomer() {
		listCustomer.add(addCustomerInfo());
		for (Customer P : listCustomer) {
			System.out.println(P.toString());
		}
		return listCustomer;
	}
	
	private Customer addCustomerInfo()
	{
		Customer customer=new Customer();
		System.out.println("\n\t\t\tEnter customer Name");
		customer.setName(Utility.inputString());
		System.out.println("\n\t\t\tEnter Company symbol");
		customer.setSymbol(Utility.inputString());
		System.out.println("\n\t\t\tEnter customer amount");
		customer.setAmount(Utility.inputInteger());
		System.out.println("\n\t\t\tEnter Company shares");
		customer.setNumberShares(Utility.inputInteger());
		return customer;
		
	}
	
	public double valueOf()
	{
		return 0.0;
	}
	
	public void buy(int amount,String symbol)
	{
		
	}
	
	public void Sell(int amount,String symbol)
	{
		
	}
	
	public void save(String file)
	{
		try {
			mapper.writeValue(new File( "StockAccount//"+file + ".json"), listCustomer);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printReport()
	{
		
	}
	
	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void saveCompany() {
		try {
			mapper.writeValue(new File( "StockAccount//Companies.json"), listCompanies);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Purpose : readnDisplayFiles is a function is to read and display files.
	 */
	public void readnDisplayFiles() {
		File f = new File("StockAccount//");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				System.out.println("\n\t\t\t"+file.getName());
				count++;
			}
		}
		System.out.println("\n\t\t\tNumber of files: " + count);
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	public void operation() throws Exception
	{
		System.out.println("\n\t\t\tEnter the name of the Customer \n");
		String presentCustomerFile = Utility.inputString();
		if (searchingAddress(presentCustomerFile)) {
			System.out.println("\t\t\tFile Exists\n");
			//read(presentCustomer);
			boolean menu=true;
			while (menu) {
				System.out.println("\n\t\t***** Menu *****\n");
				System.out.println("\t1. Add  new Person information");
				System.out.println("\t2. Edit  information");
				System.out.println("\t3. Remove information");
				System.out.println("\t4. Display   information");
				System.out.println("\t5. Go for Main Menu");
				int choose = Utility.inputInteger();
				switch (choose) {
				case 1:	addCustomerInfo();
						save(presentCustomerFile);
						break;
				case 2:	edit();
						save(presentCustomerFile);
						break;
				case 3: remove();
						break;
				case 4:	printAll();
						break;
				case 5:	menu=false;
						break;
				default:System.out.println("\t\t\tinvalid input......Please try again");
						break;
			}
		}
	}
}
	
	/**
	 * Purpose : Checks whether the file is present or not
	 * 
	 * @param inputAddressBook is the name of file to be checked 
	 * @return returns true if file is present otherwise false.
	 */
	public boolean searchingAddress(String presentCustomer) {
		File f = new File("StockAccount//");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(presentCustomer + ".json")) {
					
					count++;
					break;
				}
			}
		}
		if (count == 0)
			return false;
		else
			return true;
	}
	
	/* 
	 *Purpose : Edit information of existing Person from list 
	 */
	public void edit() {
		System.out.println("\n\t\t\tEnter Symbol of company to edit");
		String Symbol = Utility.inputString();
		for (Customer customer : listCustomer) {
			if (Symbol.equals(customer.getSymbol())) {
				COUNT++;
				System.out.println("\n\t\t\tData found\n");
				editCustomerInformation(customer);
			} 
		}
		if(COUNT==0)
			System.out.println("\n\t\t\tData not found");
	}
	
	
	/* 
	 * Purpose : Removing data of a person from list
	 */
	public void remove() throws Exception {
		System.out.println("\n\t\t\tEnter Company Symbol to remove data");
		String firstName = Utility.inputString();
		int count = 0;
		List<Customer> deleteInfo = new ArrayList<>();
		for (Customer customer : listCustomer) {
			if (firstName.equals(customer.getSymbol())) {
				System.out.println("\n\t\t\tData found\n\n\t\t\tData Removed");
				deleteInfo.add(customer);
				count++;
			}
		}
		listCustomer.removeAll(deleteInfo);
		if (count == 0)
			System.out.println("\n\t\t\tdata not found");
	}
	
	/* 
	 * Purpose : Displaying the list
	 */
	public void printAll() {
		for (Customer customer : listCustomer) {
			System.out.println(customer.toString());
		}
	}
	
	/**
	 * @throws Exception
	 */
	public void buyShares() throws Exception
	{
		
		System.out.println("\nenter symbol of company");
		String companySymbol=Utility.inputString();
		String customerName="";
		Companies company=stockImp.searchCompany(companySymbol);
		System.out.println(company.getCompanyName());
		System.out.println("\nenter any customer name");
		customerName=Utility.inputString();
		Customer customer=stockImp.searchCustomer(customerName);
		System.out.println("\tenter amount to buy shares");
		int amount=Utility.inputInteger();
		buy(amount,customer,company);
		
	}
	
	public void buy(int amount,Customer customer,Companies company)
	{
		
		if(amount<=customer.getAmount())
		{
			int quotient=0;
			int rem=0;
			int priceShare=company.getSharePrice();
			int res=amount/priceShare;
			if(company.getTotalShares()>=res)
			{
				int remainingAmount=amount-res;
				customer.setAmount(remainingAmount);
				company.set
			}
		}
		else
		{
			
		}
		
	}
	
	/**
	 * @param details
	 * @return
	 * @throws Exception 
	 */
	public Companies searchCompany(String details) throws Exception
	{	
		int count=0;
		Companies company1=new Companies();
		for (Companies company : listCompanies) {
			if (details.equals(company.getCompanySymbol())) {
				count++;
				System.out.println("Company was Availabile");
				return company;		
			}	
	}
		if(count==0)
		{
			System.out.println("Company was not available ");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Enter Company details");
					details=Utility.inputString();
					searchCompany(details);
					break;
			case 2:Utility.stockAccount();
					break;
			default:System.out.println("invalid input");
				System.exit(0);
			}
		}	
		
		return company1;
	}
	
	/**
	 * @param details
	 * @return
	 * @throws Exception 
	 */
	public Customer searchCustomer(String customerName) throws Exception
	{	
		int count=0;
		Customer customertemp=new Customer();
		for (Customer customer : listCustomer) {
			if (customerName.equals(customer.getName())) {
				count++;
				System.out.println("Customer was Availabile");
				return customer;		
			}	
	}
		if(count==0)
		{
			System.out.println("Customer was not available ");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Enter Customer name");
					customerName=Utility.inputString();
					searchCustomer(customerName);
					break;
			case 2:Utility.stockAccount();
					break;
			default:System.out.println("invalid input");
				System.exit(0);
			}
		}	
		
		return customertemp;
	}
	
	/**
	 * Purpose : Editing of Address and phone number
	 * 
	 * @param P is the person object.
	 * @param i is the case for editing address or phone number.
	 */
	private void editCustomerInformation(Customer customer) {
		
			boolean status=true;
		while(status)
		{
			
			System.out.println("\n\t\t\t1. To edit the Name");
			System.out.println("\n\t\t\t2. To edit the amount");
			System.out.println("\n\t\t\t3. To edit the symbol");
			System.out.println("\n\t\t\t4. To edit the shares");
			System.out.println("\n\t\t\t5. Save and Exit");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Please Enter");
					customer.setName(Utility.inputString());
			case 2:	System.out.println("Please Enter");
					customer.setAmount(Utility.inputInteger());
					break;
			case 3:	System.out.println("Please Enter");
					customer.setSymbol(Utility.inputString());
					break;
			case 4:	System.out.println("Please Enter");
					customer.setNumberShares(Utility.inputInteger());
					break;
			case 5:	System.out.println("\n\t\t\tInformation updated ");
					status=false;
					break;
			default:System.out.println("Invalid input");
					break;
			}
			
		}
			
	}
	

}
