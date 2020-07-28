/**
 * 
 */
package com.learn4j.questions;

/**
 * @author jose
 *
 */
public class ArraysAndStrings {

    /**
     * 
     */
    public ArraysAndStrings() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Checks if is unique.
     *
     * @param str the str
     * @return true, if is unique
     */
    public boolean isUnique (String str) {
        char[] chr = str.toCharArray();
        for (int i=0; i<chr.length; i++) {
            char c = chr[i];
            for(int j=i+1; j<chr.length; j++) {
                if (c == chr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Checks if is permuted.
     *
     * @param str1 the str 1
     * @param str2 the str 2
     * @return true, if is permuted
     */
    public boolean isPermuted (String str1, String str2) {
        char [] chr = str1.toCharArray();
        permute(chr, 0);
        return false;
    }

    private void permute(char[] chr, int index) {
        for (int i = index; i < chr.length; i++) {
            chr = swap (chr, index, i);
            print(chr);
        }
        if (index < chr.length) {
            permute(chr, index+1);
        } else {
            return;
        }
    }

    private void print(char[] chr) {
        for (char ch : chr) {
            System.out.print(ch);
        }
        System.out.println("");
    }

    private char[] swap(char[] chr, int index, int i) {
       char chrTemp = chr[index];
       chr[index] = chr[i];
       chr[i]=chrTemp;
       return chr;
    }

    
    

}
