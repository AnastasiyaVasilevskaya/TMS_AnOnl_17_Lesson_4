import java.util.Arrays;

public class AlphabetSort {
    public static void main(String[] args) {
        String[] array = {"Mariya", "Anastasiya", "Dmitriy", "Yuliya", "Stanislav"};
        Arrays.sort(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
