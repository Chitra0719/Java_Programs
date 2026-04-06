package sampleprogram;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s ="TestJava";
        System.out.println(s.length());
        String s1 ="TestJava";
        String s2 ="Testjava";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.charAt(4));
        int a =456;
        System.out.println(String.valueOf(a));
	}

}
