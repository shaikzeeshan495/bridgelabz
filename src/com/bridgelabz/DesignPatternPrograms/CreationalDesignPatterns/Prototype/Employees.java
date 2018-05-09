package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	private List<String> empList;
	
	/**Employees zero parameter constructor creating instance.
	 * 
	 */
	public Employees()
	{
		empList=new ArrayList<String>();
	}
	
	/**parameter constructor create a new list to new object.
	 * @param list new list
	 */
	public Employees(List<String> list){
		this.empList=list;
	}
	
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Lenovo");
		empList.add("HP");
		empList.add("Apple");
		empList.add("Dell");
	}
	
	/**getEmpList is to get list.
	 * @return object of employees list.
	 */
	public List<String> getEmpList() {
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}

}
