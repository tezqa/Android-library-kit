package com.tezqa.android.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class NetworkMonitor {

    /**
     * Checking for connectivity
     * @param context   Context needed
     * @return          true if network detected, false if not
     * **/
    public static boolean isConnectedToInternet(final Context context) {

        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) return true;
                }
            }
        }
        return false;

    }

}
