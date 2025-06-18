import java.util.Scanner;
class markantonuy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ab = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tp=0;

        switch (ab){
            case '+':
                tp = a + b;
                break;
            case '-':
                tp = a - b;
                break;
            case '*':
                 tp = a * b;
                break;            case '/':
                if (b != 0) {
                    tp = a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Sum of a and b is: " + tp);
    }
}