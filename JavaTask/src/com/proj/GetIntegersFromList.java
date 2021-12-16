package com.proj;

import java.util.ArrayList;
import java.util.List;

public class GetIntegersFromList {
    public static List getIntegersFromList(List a)
    {
        List arr = new ArrayList<>();
        for (int i = 0; i<a.toArray().length; i++)
            if (a.get(i) instanceof Integer) arr.add(a.get(i));
        return arr;
    }
}
