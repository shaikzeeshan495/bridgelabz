/******************************************************************************
 *  Purpose:	ProxyInternet
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet
{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
     
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
     
    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
         
        internet.connectTo(serverhost);
    }
 
}
