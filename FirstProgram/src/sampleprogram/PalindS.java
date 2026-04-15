/*1. Program to check whether the given Strings are
Palindrome or not.
• Java
• Malayalam */

package sampleprogram;
public class PalindS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String og = "Malayalam";
         StringBuffer ogdata = new StringBuffer(og);
	     String revdata = ogdata.reverse().toString();
	     System.out.println("Original " + og);
	     System.out.println("Reversed " + revdata);
	   
       if(og.equalsIgnoreCase(revdata))
       {
    	   
    	   System.out.println("Palindrome");
       }
       else
       {
    	   
    	   System.out.println("Not Palindrome");
       }}}
