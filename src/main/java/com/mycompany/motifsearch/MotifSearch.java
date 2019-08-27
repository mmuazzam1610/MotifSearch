/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motifsearch;

import java.util.ArrayList;

public class MotifSearch {
    static ArrayList<String> motifs;
    static void generatePermutations(String str, String stringToPrint){
        if(stringToPrint.length()==str.length()){
            motifs.add(stringToPrint);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            generatePermutations(str, stringToPrint + str.charAt(i));
        }
    }
    boolean compareMotifs(String[] inputs, String motif){
       
        return false;
    }
    public static void main(String args[]){
        motifs = new ArrayList<>();
        generatePermutations("ACTG", "");
        
    }
}
