/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motifsearch;

import java.util.ArrayList;

/**
 *
 * @author hafiz
 */
public class MotifSearch {
   static ArrayList<String> motifs;
   static void printPermutation(String str, String stringToPrint){
        if(stringToPrint.length()==str.length()){
            motifs.add(stringToPrint);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            printPermutation(str, stringToPrint + str.charAt(i));
        }
   }
    public static void main(String args[]){
        motifs = new ArrayList<>();
        printPermutation("ACTG", "");
        System.out.println(motifs.size());
    }
}
