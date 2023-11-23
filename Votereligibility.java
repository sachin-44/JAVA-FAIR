import java.util.Scanner;
public class Voter_48 {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = reader.nextInt();
            if (age >= 18) {
                System.out.println("Voter is eligible to vote.");
            } else {
                MyException me = new MyException();
                throw me;
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends RuntimeException {
    public String toString() {
        return "Voter is not eligible to vote.";
    }
}
