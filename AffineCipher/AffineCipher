
import java.util.*;
class HelloWorld {
    static int a, b ;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b");
        a = in.nextInt();
        b = in.nextInt();
        
        String cipherText = cipher();
        String DecipherText = decrypte(cipherText);
        System.out.println(cipherText);
          System.out.println(DecipherText);
    
    }
    
    static String cipher(){
        
        String plaintext = "";
        
        Scanner in = new Scanner(System.in);
        System.out.print("HATA MA 3INDK YA GHOLAM en uppercase please");
        plaintext = in.nextLine();
        
        String cipherText = "";
        for(int i = 0; i < plaintext.length(); i++){
           char t = plaintext.charAt(i);
           int Value= (char)t-65;
           int c = (a*Value + b) % 26;
           char C = (char)(c+65);
           cipherText+= C;
            }
            return cipherText;
        }
        
        static String decrypte(String cipher){
            String plainText = "";
            for (int i=0; i<cipher.length(); i++){
                char c = cipher.charAt(i);
                int Value = (char)c -65;
                int decrypting = ((modInverse(a, 26))* (Value - b))%26;
                
                char T = (char) (decrypting + 65);
                plainText += T;
            }
            return plainText;
        }
      static int modInverse(int a, int m){
          a = a% m;
          for (int x = 1; x<m; x++)
          if ((a*x)%m == 1)
          return x;
          return 1;
      }  
        
    }

