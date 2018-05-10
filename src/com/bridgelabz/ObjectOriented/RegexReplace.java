package com.bridgelabz.ObjectOriented;

import com.bridgelabz.utility.Utility;

public class RegexReplace {
	public static void main(String[] args) {
		String mainString="Hello <<name>>, "
				+ "We have your full name as <<full name>> in our system. "
				+ "your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification "
				+ "Thank you BridgeLabz 01/01/2016.";
		Utility.regexReplace(mainString);

	}

}
