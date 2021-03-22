package strings;

public class StringsTest3 {
	public static void main(String[] args) {
		
		String first="Selenium";
		String second="Selenium.";
		
		boolean result=first.equals(second);
		System.out.println(result);
		
		
		String str="Seleniumnumber";
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.indexOf('n'));
		
		System.out.println(str.indexOf('W'));//-1
		
		String st="Java Programming";
		System.out.println(st.indexOf('a',4));
		
		String name="    Online Training    ";
		System.out.println(name);
		System.out.println(name.trim());
		
	}

}
