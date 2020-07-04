package school;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name from keyboard");
       String input= scanner.nextLine();
        System.out.println("My name is "+input);
    }
}
