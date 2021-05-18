class Problem {
    public static void main(String[] args) {
        int sum1 = Integer.parseInt(args[1]);
        int sum2 = Integer.parseInt(args[2]);
        int sum;
        switch(args[0]){
            case "+":
                sum = sum1 + sum2;
                System.out.println(sum);
                break;
            case "-":
                sum = sum1 - sum2;
                System.out.println(sum);
                break;
            case "*":
                sum = sum1 * sum2;
                System.out.println(sum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}