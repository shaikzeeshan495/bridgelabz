package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.ProxyDesignPattern;

public class ClientProxy {
	public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("BridgeLabz.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
