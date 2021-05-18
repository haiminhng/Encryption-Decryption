import java.sql.SQLOutput;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int wordLength = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > wordLength) {
                wordLength = words[i].length();
                index = i;
            }
        }
        System.out.println(words[index]);
    }
}