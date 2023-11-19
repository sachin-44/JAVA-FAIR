import java.util.Scanner;
class BinDecCon_21{
    public static void main(String[] args) { 
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter 1 to convert binary to decimal, or 2 to convert decimal to binary: ");
    int choice = reader.nextInt(); 
switch (choice)
{ 
    case 1: 
    System.out.print("Enter a binary number: "); 
    String binary = reader.next();
    int decimal = Integer.parseInt(binary, 2);
    System.out.println("The decimal equivalent of " + binary + " is " + decimal); 
    break;
    case 2: 
    System.out.print("Enter a decimal number: ");
    int decimalNum = reader.nextInt();
    String binaryNum = Integer.toBinaryString(decimalNum);
    System.out.println("The binary equivalent of " + decimalNum + " is " + binaryNum); 
    break;
    default: 
    System.out.println("Invalid choice!"); 
    break;
} 
} 
}
