package com.general;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressFromHostName
{

    public static void main(String[] args)
    {
        try
        {
            InetAddress inetAddress=InetAddress.getByName("sna60lt321296");
            System.out.println(inetAddress.getHostAddress());
        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
    }

}
