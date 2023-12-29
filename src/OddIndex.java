import java.util.Arrays;

public class OddIndex {
    public static void main(String[] args) {
        int[] array = {100, 33, 200, -4, 300, 5, 400, 6};
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Элементы с нечетным индексом заменены на 0: " + Arrays.toString(array));
    }
}
