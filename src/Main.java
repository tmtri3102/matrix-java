import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Width = ");
        double width = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.display();
    }
}
