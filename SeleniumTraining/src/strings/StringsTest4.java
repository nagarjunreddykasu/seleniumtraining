package strings;

public class StringsTest4 {
	public static void main(String[] args) {
		
		String months="Jan,Feb,Mar,Apr,May,Jun";
		
		String[] result=months.split(",");
		
		for(String str:result){
			System.out.println(str);
		}
		
		
		String res="There are only 8 products available";
		String number=res.split("only")[1].split("products")[0].trim();
		System.out.println(number);
		System.out.println(number+2);
		
		
		System.out.println(Integer.parseInt(number)+2);//10
	
		
		
	}

}
