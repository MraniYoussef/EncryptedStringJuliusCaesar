public class EncryptStr {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        String res ="";
        k=k%26;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char newch = (char) (ch+k);
                if(newch>90){
                    newch = (char) (newch%90 + 64);
                }
                res += newch;
            }else if(Character.isLowerCase(ch)){
                char newch = (char) (ch+k);
                if(newch>122){
                    newch = (char) (newch%122 + 96);
                }
                res += newch;
            }else {
                res += ch;
            }
        }
        return res;

    }

}


