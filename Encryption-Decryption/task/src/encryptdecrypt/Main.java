package encryptdecrypt;

import java.util.Scanner;
public class Main {
        public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

                String mode = "enc"; // If there is no -mode, standard mode is enc.
                    int key = 0;       // If there is no -key, standard key = 0.
                    String buf = "";     // If there is no -data, standard data is an empty string.
                    String alg = "shift";   // standard method to encrypt and decrypt is shift.
                // if no argument was given
                if(args.length == 0){
                        System.out.println("Please choose a mode");
                }
                for (int i = 0; i < args.length; i++) {
                    switch (args[i]){
                            case "-mode":
                                    if (i + 1 == args.length || args[i + 1].startsWith("-")) {
                                            System.out.println("Error : Please enter a valid mode value -mode");
                                            // if the nexte value after -mode not enc or dec
                                    } else if (!args[i + 1].equals("enc") && !args[i + 1].equals("dec")) {
                                            System.out.println("Error : Invalid parameter " + args[i + 1] + " for -mode");
                                    } else {
                                            mode = args[i + 1];
                                    }
                                    break;
                            case "-key":
                                    if (i + 1 == args.length || args[i + 1].startsWith("-")){
                                    System.out.println("Error : Please entern key value -key");
                                    // if the next value after -key is not digit
                                    } else if (!args[i + 1].matches("[0-9]")) {
                                            System.out.println("Error : Shift key should only be a number!");
                                    } else {
                                            key = Integer.parseInt(args[i + 1]);
                                    }
                                    break;
                            case "-data":
                                    if (i + 1 == args.length || args[i + 1].startsWith("-")){
                                            System.out.println("Error : Please enter a valid value -data");
                                    } else {
                                            buf = args[i + 1];
                                    }
                                    break;
                    }
                }

                char[] strIn = buf.toCharArray();
                for (int i = 0; i < strIn.length; i++) {
                        if (mode.equals("enc")) {
                                strIn[i] += key;
                        } else if (mode.equals("dec")) {
                                strIn[i] -= key;
                        }
                        System.out.print(strIn[i]);
                }


            /*
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.nextLine();
            char[] strIn = scanner.nextLine().toCharArray();
            int shift = scanner.nextInt();

            for (int i = 0; i < strIn.length; i++) {
                if (operator.equals("enc")) {
                    strIn[i] += shift;
                } else if (operator.equals("dec")) {
                    strIn[i] -= shift;
                }
                System.out.print(strIn[i]);
            }
             */
    }
}