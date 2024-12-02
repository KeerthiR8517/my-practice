public class Count_Vowels_Consonants
{
    public static void main(String args[]) {
        String str="hi,helllo.";
        String str1="";
        int constant=0, vowels=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels++;
            }
            else if((ch>='a'&& ch<='z')||(ch>='A'&& ch>='Z')){
                constant++;

            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + constant);
    }
}
