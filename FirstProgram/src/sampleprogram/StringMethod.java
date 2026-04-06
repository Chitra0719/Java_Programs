package sampleprogram;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "java";
      System.out.println(s.length());
      int x = 10;
      String s1 ="demo";
      String s2 ="Demo";
      String s3 ="demo";
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equalsIgnoreCase(s2));
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
      System.out.println(s.startsWith("j"));
      System.out.println(s.endsWith("a"));
      System.out.println(s.charAt(2));
      System.out.println(String.valueOf(x));
      
	}

}
