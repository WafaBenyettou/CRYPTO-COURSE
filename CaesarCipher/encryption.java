import java.util.*;
public class CaesarCipher{

	public static StringBuffer encrypt(String text, int s)
	{
		StringBuffer result= new StringBuffer();

		for (int i=0; i<text.length(); i++)
		{
		
				char ch = (char)(((int)text.charAt(i) +
								s - 65) % 26 + 65);
				result.append(ch);
			}
		
		return result;
	}

	// Driver code
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter text");
	    String text = sc.nextLine();
	    System.out.println("Enter steps");
		int s = sc.nextInt();
		System.out.println("Text : " + text);
		System.out.println("Shift : " + s);
		System.out.println("Cipher: " + encrypt(text, s));
	}
}