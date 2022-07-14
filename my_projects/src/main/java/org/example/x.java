package org.example;

import java.util.*;

class x{
    public static void main(String args[]){
        int input0=12;
        int input1=1313;
        int input2=122;
        int input3=678;
        int input4=898;
        List<Integer> temp1=new ArrayList<>();
        temp1.add(input0);
        temp1.add(input1);
        temp1.add(input2);
        temp1.add(input3);
        temp1.add(input4);
        List<Integer> strong=new ArrayList<>();
        List<Integer> week=new ArrayList<>();
        for(int j=0;j<3;j++) {
            String x = String.valueOf(temp1.get(j));
            char[] ch = x.toCharArray();
            Map<Character, Integer> dict = new Hashtable<Character, Integer>();
            List<Integer> temp2=new ArrayList<>();
            for (char temp : ch) {

                if (dict.get(temp) == null)
                    dict.put(temp, 1);
                else
                    dict.put(temp, dict.get(temp) + 1);
            }

            if (Collections.min(dict.values())== Collections.max(dict.values())) {
                strong.add(Integer.valueOf(x));
            } else {
                week.add(Integer.valueOf(x));
            }
        }
        System.out.println(Collections.max(strong)-Collections.min(week));

    }
}
