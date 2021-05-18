import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        String str = "";
        int _cv = 0;

            Scanner input = new Scanner(System.in);
            do {
                str = input.next();
                try {
                _cv = 10 * Integer.parseInt(str);
                if(_cv != 0){
                    System.out.println(_cv);
                }
             }
                catch(Exception e){
                    System.out.println("Invalid user input: " + str);
                }
            } while(_cv != 0);
    }
}