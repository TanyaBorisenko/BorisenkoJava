import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        String name = "Вячеслав";

        if (name.equals(newName)) {
            System.out.println("Привет, Вячеслав.");
        } else {
            System.out.println("Нет такого имени.");
        }
    }
}
