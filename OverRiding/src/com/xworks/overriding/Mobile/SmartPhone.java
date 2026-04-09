package com.xworks.overriding.Mobile;

public class SmartPhone extends Mobile
{
    @Override
    public void unlock() {
        System.out.println("unlocked using Face Id or Fingerprint");
    }
}
