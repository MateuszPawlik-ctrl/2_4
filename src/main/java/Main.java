import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.util.in);

        System.out.println("Wybierz działanie:");
        System.out.println("1 – Suma (+)");
        System.out.println("2 – Różnica (-)");
        System.out.println("3 – Iloczyn (*)");
        System.out.println("4 – Iloraz (/)");
        System.out.print("Twój wybór: ");
        int wybor = skaner.nextInt();
        
        System.out.print("Podaj pierwszą liczbę (a): ");
        double a = skaner.nextDouble();

        System.out.print("Podaj drugą liczbę (b): ");
        double b = skaner.nextDouble();

        switch (wybor) {
            case 1:
                System.out.println("Wynik sumy: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik różnicy: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik iloczynu: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                } else {
                    System.out.println("Wynik ilorazu: " + (a / b));
                }
                break;
            default:
                System.out.println("Niepoprawny wybór! Wybierz cyfrę od 1 do 4.");
                break;
        }

        skaner.close();
    }
}