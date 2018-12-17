package ua.hillel.kvartalnyi.lesson02.task04;

public class Task04 {

    public static void main(String[] args) {
        int[] mas = {2, 0, 4, 9, 5, 3, 6, 8, 7, 33, 34};

        for (int i = 0; i < mas.length; i++) {
            if
                ( (mas[i] % 3) == 0 && mas[i] !=0 )

            System.out.println(mas[i]);
        }
    }
}
