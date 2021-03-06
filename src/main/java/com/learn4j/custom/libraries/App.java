package com.learn4j.custom.libraries;

import com.learn4j.questions.ArraysAndStrings;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
        sb.append("Jose ");
        sb.append("Welcome");
        System.out.println(sb.toString());
        
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("Jose");
        al.add("Anand");
        System.out.println(al.get(1));
        
        HashTable ht = new HashTable();
        ht.put("test", "value");
        ht.put("key1", "mark");
        ht.put("key2", "template");
        ht.put("key3", "sky");
        ht.put("key4", "orange");
        System.out.println(ht.get("test"));
        System.out.println(ht.get("key4"));
        System.out.println(ht.get("key2"));
        System.out.println(ht.get("key3"));
        System.out.println(ht.get("key1"));
        
        ArraysAndStrings as = new ArraysAndStrings();
        System.out.println(as.isUnique("awk"));
        System.out.println(as.isUnique("Jose"));
        System.out.println(as.isUnique("Anand"));
        System.out.println(as.isUnique("arockia"));
        System.out.println(as.isUnique("steffi"));
        System.out.println(as.isUnique("erin"));
        
        as.isPermuted("abc", "bac");
    }
}
