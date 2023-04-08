import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {3.9, -1.3, 3.2, 2.9, -2.3, 3.3, 4.8, 3.8, 2.2, 9.8, -4.8, 3.4, -2.1, 9.5, -9.0};

        double sum = 0.0;
        double count = 0.0;
        boolean first = false;

        for (double answer : numbers) {
            if (answer < 0) {
                first = true;
            } else if (first) {
                sum += answer;
                count++;
            }
        }
        if (first) {
            double result = sum / count;
            System.out.println("Среднее арифметическое: " + result);
        }

        double[] mas = {3.9, -1.3, 3.2, 2.9, -2.3, 3.3, 4.8, 3.8, 2.2, 9.8, -4.8, 3.4, -2.1, 9.5, -9.0};

        boolean sort = false;
        double buf;
        while (!sort) {
            sort = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    sort = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}