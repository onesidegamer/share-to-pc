package com.onesidegamer.raitshare.util;

import java.net.NetworkInterface;

/**
 * created by:kailas_rathod
* date: 5.11.2017 15:02
 */

public class AddressedInterface
{
    private NetworkInterface networkInterface;
    private String associatedAddress;

    public AddressedInterface(NetworkInterface networkInterface, String associatedAddress)
    {
        this.networkInterface = networkInterface;
        this.associatedAddress = associatedAddress;
    }

    public String getAssociatedAddress()
    {
        return associatedAddress;
    }

    public NetworkInterface getNetworkInterface()
    {
        return networkInterface;
    }
}
