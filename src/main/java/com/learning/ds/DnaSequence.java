package com.learning.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DnaSequence {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> seen=new HashSet<>();
        Set<String> ans=new HashSet<>();

        for(int i=0; i+10<s.length();i++){
            String ten = s.substring(i, i+10);
            if(!seen.add(ten)){
                ans.add(ten);
            }
        }

        return new ArrayList<>(ans);
    }
}
