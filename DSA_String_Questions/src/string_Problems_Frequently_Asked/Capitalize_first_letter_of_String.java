package string_Problems_Frequently_Asked;

public class Capitalize_first_letter_of_String {
	public static String capitalizeFirstString(String s)
	{
		StringBuilder result=new StringBuilder();
		String []words=s.split(" ");
	
		for(String word:words)
		{
			if(!word.isEmpty()) {
			result.
			append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1)).append(" ");
			}
		}
		
		return result.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" hello whas sup ";
		System.out.println(capitalizeFirstString(s));

	}

}
