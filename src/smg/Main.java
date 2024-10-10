package smg;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the title of the book:");
        String bookName = sc.nextLine();
        System.out.println(bookName);
    }
}
