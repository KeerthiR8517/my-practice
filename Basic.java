//public  class Basic {
//    int sum(int a, int b){
//        int c=a+b;
//        System.out.println(c);
//
//        return c;
//
//    }
//    public static void main(String args[]){
//        Basic b=new Basic();
//        b.sum(1,5);
//
//    }
//}
//public class Basic{
//       public static void main(String args[]){
//           int num=50;
//           if(num%2==0){
//               System.out.println("it is a even number" );}
//
//               else{
//                   System.out.println("not a odd  number");
//           }
//       }
//}
//public class Basic{
//    public static void main (String args[]){
//        int num =1000;
//        int num1=878;
//        int num2=900;
//        if(num> num1 && num>num2) {
//            System.out.println(num+ "num is greater");
//        } else if(num1> num && num1> num2){
//            System.out.println(num1+"num is greater" );
//        }
//        if(num2>num && num2> num1){
//            System.out.println(num2+ "num is greater" );
//        }
//
//    }
// }

//public class Basic{
//    public static void main (String args[]){
//        int number=1563;
//        int reverse=0;
//        while(number!=0){
//            int  reverse1=number%10;
//            reverse=reverse*10+reverse1;
//            number=number/10;
//        }
//        System.out.println("reverse number is :"+ reverse);
//    }
//}
//public class Basic{
//  public static void main(String args[]){
//  String str="MADAM";
//  String str1="";
//  for(int i=str.length()-1;i>=0;i--){
//      str1 +=str.charAt(i);
//  }
//  if(str.equals(str1.trim())) {
//      System.out.println("it is a pallindrom");
//  }
//      else{
//          System.out.println("it's not a pallindrom");
//      }
//  }

//}
// public class Basic{
//    public static void main(String args[]){
//        int n=5;int fact=1;
//        for(int i=1;i<=n;i++){
//           fact=fact*i;
//        }
//        System.out.println(fact);
//    }
//}
//public class Basic{
//    public static void main(String args[]){
//int a=0,n=8,b=1,c,sum=0;
//        for (int i = 0; i < n; i++) {
//            sum=sum+ a;
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
//    }
//}

public class Basic{
public static void main(String args[]) {
    String str="hi,helllo.";
    String str1="";
    int constant=0, vowels=0;
    for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
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









