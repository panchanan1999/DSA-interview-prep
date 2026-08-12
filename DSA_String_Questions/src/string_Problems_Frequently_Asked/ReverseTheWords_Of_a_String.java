package string_Problems_Frequently_Asked;

public class ReverseTheWords_Of_a_String {
	
	public static String reverseWordOfString(String s)
	{
		/*Steps-> 1.Split the string by spaces
		 2.Create a string to store the result
		 3.traverse through the words array
		 4.append the value with result
		 5.if(i!=0) result+=" ";
		 */
		String result="";
		String []words=s.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			result=result+words[i];
			
			if(i!=0)
			{
				result+=" ";
			}
		}
		return result;
		
	}
	public static void main(String[] args) {

        String s = "Hello How are You ?";

        System.out.println("The reverse words : " + reverseWordOfString(s));
    }

}
