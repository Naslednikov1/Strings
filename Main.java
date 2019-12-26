import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num3(in.nextLine());
    }
    public static void num1(String str) {
        int counter = 0;
        char[] vowels = {'a', 'u', 'i', 'o', 'e'};
        for (String word : str.split("\\s")) {
            word = word.toLowerCase();
            char firstLetter = word.charAt(0);
            for (char vowel : vowels) {
                if (firstLetter == vowel){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    public static void num2(String str){
        int i = 0;
        for (String word : str.split("\\s")){
            if (word.length() == 3){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static void num3(String str){
        int maxLength = 0;
        String maxLengthWord = "";
        for (String word : str.split("\\s")){
            if (word.length() >= maxLength){
                maxLength = word.length();
                maxLengthWord = word;
            }
        }
        System.out.println(maxLengthWord);
    }
}
