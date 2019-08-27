/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motifsearch;

import java.util.ArrayList;

public class MotifSearch 
{
    static ArrayList<String> motifs;
    static void generatePermutations(String str, String stringToPrint)
    {
        if(stringToPrint.length()==str.length())
        {
            motifs.add(stringToPrint);
            return;
        }
        for (int i = 0; i < str.length(); i++) 
        {
            generatePermutations(str, stringToPrint + str.charAt(i));
        }
    }
    static boolean compareMotifs(String[] inputs, String motif)
    {
        boolean[] found = {false, false, false};
        for (int i = 0; i < inputs.length; i++)
        {
            String s = inputs[i];
            for (int j = 0; j < s.length() - 3; j++)
            {
                int count = 0;
                String sub = s.substring(j, j + 4);
                for (int k = 0; k < sub.length(); k++)
                {
                    if (sub.substring(k, k+1).equals(motif.substring(k, k+1))) count+= 1;
                }
                if (count >= 3)
                {
                    //System.out.println(s.substring(j, j + 4));
                    found[i] = true;
                }
            }
        }
        for (int i = 0; i < 3; i++)
        {
            if (!found[i]) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        motifs = new ArrayList<>();
        generatePermutations("ACTG", "");
        String arry[] = {"ACTGACGCAG", "TCACAACGGG", "GAGTCCAGTT"};
        System.out.println("Output Set: ");
        for (int i = 0; i < motifs.size(); i++)
        {
            if (compareMotifs(arry, motifs.get(i))) System.out.println(motifs.get(i));
        }
    }
}
