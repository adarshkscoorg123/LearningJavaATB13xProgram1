package ex_15_Java_Strings;

public class Practice_palindrome {

    public static void main(String[] args) {
        String str= "abba";
        String nstr="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("abba");
        //Example word
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
            }
        System.out.println("Reversed word: "+ nstr);
        if(str.equals(nstr)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }

    }
