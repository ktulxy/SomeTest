import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter some a: ");
        String a1 = in.nextLine();
        System.out.print("Enter some b: ");
        String b1 = in.nextLine();
        System.out.print("Enter some c: ");
        String c1 = in.nextLine();
        System.out.println("Your input is a:" + a1 + " b:" + b1 + " c:" + c1);

        String result = function(a1, b1, c1);
        System.out.print(result);
    }

    public static String function(String a1, String b1, String c1) {

        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = Integer.parseInt(a1);
            b = Integer.parseInt(b1);
            c = Integer.parseInt(c1);
        } catch (NumberFormatException e) {
            return "4 - Error";
        }

        if ((a<=0) || (b<=0) || (c<=0)) return "4 - Error";
        if ((a==b) && (a==c))  return "3 - Equilateral равносторонний"; else
        if ((a==b) || (a==c) || (c==b))   return "2 - Isosceles равнобедренный";
        else return "1 - Scalene Неравносторонний";
    }
}

