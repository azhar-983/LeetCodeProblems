package com.lc.corejava;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.addElement("azhar");
        v.addElement("seshu");
        v.addElement("bhaskar");
        Collections.sort(v);
        //Enumeration cursor
        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);

        List<String> strList = new ArrayList<>();

        strList.add("azhar");
        strList.add("rakesh");

        //Collections.sort(list,Collections.reverseOrder());

        //Iterator cursor
        Iterator itr = list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //ListIterator cursor
        ListIterator listItr = list.listIterator();
        while (listItr.hasNext())
            System.out.println(listItr.next());
        System.out.println(list);
    }
}
