import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur de la chaine : ");
        //length of String input
        int n = sc.nextInt();
        //String input
        String s=sc.next();
        while (s.length()<n){
            System.out.println("La longueur que tu dois saisir est : "+n);
             s=sc.next();
        }


        String cutName = s.substring(0, n);
        if (s.length()>n) {
            s = cutName;
        }
        //the number of letters to rotate
        int k = sc.nextInt();
         EncryptStr encryptStr = new EncryptStr();

        String encrStr = encryptStr.caesarCipher(s,k);
        System.out.println(encrStr);
    }
}
