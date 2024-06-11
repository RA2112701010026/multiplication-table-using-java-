import java.util.Scanner;

public class Main{
    public static void main (String[]arg) {
        System.out.println("enter required table :");
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result=table*i;
            System.out.println(table + "*" + i + "=" +result);
        }

    }
    }