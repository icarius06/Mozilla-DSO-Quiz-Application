package com.mozilla.hackathon.kiboko.events;

/**
 * Created by mwadime on 6/11/2016.
 */
public class NetworkStateChanged
{
    public boolean mIsInternetConnected;
    public NetworkStateChanged(boolean isInternetConnected)
    {
        this.mIsInternetConnected = isInternetConnected;
    }
    public boolean isInternetConnected()
    {
        return this.mIsInternetConnected;
    }
}