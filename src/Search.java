import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 6, 48, 91, 0, 15, -4};
        System.out.print("Введите число для поиска в массиве: ");
        int target = scanner.nextInt();
        if (searcher(array, target)) {
            System.out.println("Число " + target + " есть в массиве!");
        } else System.out.println("Числа " + target + " нет в массиве!");
    }

    private static boolean searcher(int array[], int target) {
        for (int i : array) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}