package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Utility;

public class StockAccountImplementation {
	static int COUNT=0;
	ObjectMapper mapper = new ObjectMapper();
	public static LinkedlistStock listCompanies = new LinkedlistStock();
	public static List<Customer> listCustomer = new ArrayList<Customer>();
	public static List<Transaction> listTransaction = new ArrayList<Transaction>();
/*	/* 
	 * Purpose : Creates new file 
	 */
/*	public void createCustomer() throws IOException {
		System.out.println("\n\t\t\tEnter the name of address book");
		String StockAccountName = Utility.inputString();
		File file = new File("StockAccount//"+ StockAccountName + ".json");
		if (file.createNewFile()) {
			System.out.println("\n\t\t\tFile is created!");
		} else {
			System.out.println("\n\t\t\tFile already exists.");
		}
	}*/
	
	/**
	 * @return
	 */
	public <T extends Comparable<T>> LinkedlistStock addCompany()
	{

		listCompanies.add(addComapnyInfo());
		listCompanies.show();
			return  listCompanies;
		
	}
	
	
	
	/**
	 * Purpose : Adding information of person and add it in an object.
	 * 
	 * @return object of person with added information in it.
	 */
	private Companies addComapnyInfo() {
		Companies company = new Companies();
		
		System.out.println("\n\t\t\tEnter Company Name");
		company.setCompanyName(Utility.inputString());
		System.out.println("\n\t\t\tEnter companySymbol");
		company.setCompanySymbol(Utility.inputString());
		System.out.println("\n\t\t\tEnter price of per share");
		company.setSharePrice(Utility.inputInteger());
		System.out.println("\n\t\t\tEnter Total Shares");
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
	
	/**
	 * @return
	 */
	private Customer addCustomerInfo()
	{
		Customer customer=new Customer();
		System.out.println("\n\t\t\tEnter customer Name");
		customer.setName(Utility.inputString());
		System.out.println("\n\t\t\tEnter customer amount");
		customer.setAmount(Utility.inputInteger());
		System.out.println("\n\t\t\tEnter Company shares");
		customer.setNumberShares(Utility.inputInteger());
		return customer;
		
	}
	
	
	
	
	public void saveCustomer()
	{
		try {
			mapper.writeValue(new File( "StockAccount//Customer.json"), listCustomer);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
	public void saveTransaction()
	{
		try {
			mapper.writeValue(new File( "StockAccount//Transaction.json"), listTransaction);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printReport()
	{
		
	}
	
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void readCustomer() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("StockAccount//Customer.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<LinkedlistStock> type = new TypeReference<LinkedlistStock>() {
				};
				listCustomer = objectMapper.readValue(arrayToJson, type);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void readCompanies() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("StockAccount//Companies.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<LinkedlistStock> type = new TypeReference<LinkedlistStock>() {
				};
				listCompanies = objectMapper.readValue(arrayToJson, type);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void readTransaction() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("StockAccount//Transaction.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Transaction>> type = new TypeReference<ArrayList<Transaction>>() {
				};
				listTransaction = objectMapper.readValue(arrayToJson, type);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Purpose : readnDisplayFiles is a function is to read and display files.
	 */
/*	public void readnDisplayFiles() {
		File f = new File("StockAccount//");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				System.out.println("\n\t\t\t"+file.getName());
				count++;
			}
		}
		System.out.println("\n\t\t\tNumber of files: " + count);
	}**/
	
	/**
	 * @throws Exception 
	 * 
	 */
/*	public void operation() throws Exception
	{
		System.out.println("\n\t\t\tEnter the name of the Customer \n");
		String presentCustomerFile = Utility.inputString();
		if (searchingAddress(presentCustomerFile)) {
			System.out.println("\t\t\tFile Exists\n");
			//read(presentCustomer);
			boolean menu=true;
			while (menu) {
				System.out.println("\n\t\t***** Menu *****\n");
				System.out.println("\t1. Edit  information");
				System.out.println("\t3. Remove information");
				System.out.println("\t4. Display   information");
				System.out.println("\t5. Go for Main Menu");
				int choose = Utility.inputInteger();
				switch (choose) {
				
				case 1:	editCustomer();
						saveCustomer();
						break;
				case 3: removeCustomer();
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
}	*/
	
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
	public void editCustomer() {
		System.out.println("\n\t\t\tEnter name of customer to edit");
		String customerName = Utility.inputString();
		for (Customer customer : listCustomer) {
			if (customerName.equals(customer.getName())) {
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
	public void removeCustomer() throws Exception {
		System.out.println("\n\t\t\tEnter customer name to remove data");
		String firstName = Utility.inputString();
		int count = 0;
		List<Customer> deleteInfo = new ArrayList<>();
		for (Customer customer : listCustomer) {
			if (firstName.equals(customer.getName())) {
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
		//searc hing for company availaibity
		Companies company=searchCompany(companySymbol);
		System.out.println(company.getCompanyName());
		System.out.println("\nenter any customer name");
		customerName=Utility.inputString();
		//searching for customer availaibility
		Customer customer=searchCustomer(customerName);
		System.out.println("\tenter amount to buy shares");
		int amount=Utility.inputInteger();
		buy(amount,customer,company);
		
	}
	
	/**
	 * @param amount
	 * @param customer
	 * @param company
	 * @throws Exception
	 */
	public void buy(int amount,Customer customer,Companies company) throws Exception
	{
		
		if(amount<=customer.getAmount())
		{
			
			int priceShare=company.getSharePrice();
			int shares=amount/priceShare;
			if(company.getTotalShares()>=shares)
			{
			//	int remainingAmount=amount;
				customer.setAmount(customer.getAmount()-amount);
				customer.setNumberShares(customer.getNumberShares()+shares);
				company.setTotalShares(company.getTotalShares()-shares);
				Transaction transaction=new Transaction();
				transaction.setBuySell("buy");
				transaction.setCompanySymbol(company.getCompanySymbol());
				transaction.setCustomerName(customer.getName());
				transaction.setTotalPrice(amount);
				transaction.setTotalShares(shares);
				Date date = new Date();
				transaction.setTime(date.toString());
				listTransaction.add(transaction);
				displayTransaction();
			}
			else
			{
				System.out.println("Company had insuuficient shares");
				Utility.stockAccount();
			}
		}
		else
		{
			System.out.println("Customer had insufficient amount");
			Utility.stockAccount();
		}
		
	}
	
	public void sellShares() throws Exception
	{
		
		System.out.println("\nenter symbol of company");
		String companySymbol=Utility.inputString();
		String customerName="";
		//searc hing for company availaibity
		Companies company=searchCompany(companySymbol);
		System.out.println(company.getCompanyName());
		System.out.println("\nenter customer name");
		customerName=Utility.inputString();
		//searching for customer availaibility
		Customer customer=searchCustomer(customerName);
		System.out.println("\tenter amount to sell shares");
		int amount=Utility.inputInteger();
		buy(amount,customer,company);
		
	}
	
	public void sell(int amount,Customer customer,Companies company) throws Exception
	{
		
		if(amount>=customer.getAmount())
		{
			int priceShare=company.getSharePrice();
			int shares=amount/priceShare;
			if(company.getTotalShares()>=shares)
			{
			//	int remainingAmount=amount;
				customer.setAmount(customer.getAmount()+amount);
				customer.setNumberShares(customer.getNumberShares()-shares);
				company.setTotalShares(company.getTotalShares()+shares);
				Transaction transaction=new Transaction();
				transaction.setBuySell("Sell");
				transaction.setCompanySymbol(company.getCompanySymbol());
				transaction.setCustomerName(customer.getName());
				transaction.setTotalPrice(amount);
				transaction.setTotalShares(shares);
				Date date = new Date();
				transaction.setTime(date.toString());
				listTransaction.add(transaction);
				displayTransaction();
			}
			else
			{
				System.out.println("Company had insuuficient shares");
				Utility.stockAccount();
			}
		}
		else
		{
			System.out.println("Customer had insufficient amount");
			Utility.stockAccount();
		}
		
	}
	
	/**
	 * @param details
	 * @return
	 * @throws Exception 
	 */
	public Companies searchCompany(String details) throws Exception
	{	
/*		int count=0;
		Companies company1=new Companies();
		for (Companies company : listCompanies) {
			if (details.equals(company.getCompanySymbol())) {
				count++;
				System.out.println("Company was Availabile");
				return company;		
			}	
	}	*/
		Companies company=listCompanies.searchCompany(details);
		
	/*	if(count==0)
		{
			System.out.println("Company was not available ");
			System.out.println("enter 1 for company");
			System.out.println("enter 2 for main menu");
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
		*/
		return company;
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
			System.out.println("enter 1 for customer");
			System.out.println("enter 2 for main menu");
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
	
	public void displayCustomer()
	{
		for (Customer customer : listCustomer) {
			System.out.println(customer.toString());
		}
	}
	
	public void displayCompanies()
	{
		listCompanies.show();
		
	}
	
	public void displayTransaction()
	{
		for (Transaction company : listTransaction) {
			System.out.println(company.toString());
		}
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
			System.out.println("\n\t\t\t3. To edit the shares");
			System.out.println("\n\t\t\t4. Save and Exit");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Please Enter");
					customer.setName(Utility.inputString());
			case 2:	System.out.println("Please Enter");
					customer.setAmount(Utility.inputInteger());
					break;
			case 3:	System.out.println("Please Enter");
					customer.setNumberShares(Utility.inputInteger());
					break;
			case 4:	System.out.println("\n\t\t\tInformation updated ");
					status=false;
					break;
			default:System.out.println("Invalid input");
					break;
			}
			
		}
			
	}
	

}
