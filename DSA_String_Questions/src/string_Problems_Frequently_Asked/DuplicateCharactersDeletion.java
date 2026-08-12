package string_Problems_Frequently_Asked;
import java.util.*;
public class DuplicateCharactersDeletion {
	
	public static String DeleteDuplicateCharacters(String s)
	{
		StringBuilder result=new  StringBuilder();
		HashSet<Character>set=new HashSet<>();
		for(char ch:s.toCharArray())
		{
			if(!set.contains(ch)) {
				set.add(ch);
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String: ");	
		String input=sc.nextLine();
		System.out.println("After deleting the duplication : "+DeleteDuplicateCharacters(input));
		sc.close();
	}

}
