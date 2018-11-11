package com.ming.jbase.listbase;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest
{
    
    
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        
        
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        
        System.out.println(list);
        
        System.out.println(list.size());
        
    }
    
}
