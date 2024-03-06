
public class Vowels {
//    public String reverseVowels(String s) {
//
//        int length = s.length();
//
//        for(int i = 0; i < length ; i++){
//            result.append(s.charAt(i));
//        }
//
//
//        int n = 0,vowel = 0;
//        for(int i = 0; i < length; i++){
//
//            if(checkVowel(result.charAt(i)) && n == 0){
//                vowel = i;
//                n = 1;
//            }
//
//            if(checkVowel(s.charAt(i)) && n == 1) {
//
//            }
//        }
//
//    }

    private boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
