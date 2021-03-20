package com.onesidegamer.raitshare.ui.callback;

import com.onesidegamer.raitshare.object.NetworkDevice;

/**
 * created by:kailas_rathod
* date: 16/04/18 03:18
 */
public interface NetworkDeviceSelectedListener
{
    boolean onNetworkDeviceSelected(NetworkDevice networkDevice, NetworkDevice.Connection connection);

    boolean isListenerEffective();
}
