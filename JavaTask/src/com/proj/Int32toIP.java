package com.proj;

public class Int32toIP {
    public static String int32toIP(long ip) {
        return (ip >> 24) + "." + ((ip >> 16) & 255) + "." + ((ip >> 8) & 255) + "." + (ip & 255);
    }
}
