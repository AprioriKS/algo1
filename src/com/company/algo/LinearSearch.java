package com.company.algo;

import java.util.List;

public class LinearSearch {
    public static int linearSearch(List<String> list, String arg)  {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals((arg))) {
                return i;
            }
        }
        return -1;
    }

}
