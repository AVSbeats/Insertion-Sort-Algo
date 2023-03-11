public class InsertionSortAlgorithm {
    // This is a sorting algorithms

    public static void main(String[] args) {

        int[] numbers = { 4, 6, 8, 5, 1 };

        int a = 1;
        int b;
        int temp;

        while (a < numbers.length) {
            temp = numbers[a];
            b = a - 1;

            while (b >= 0 && numbers[b] > temp) {
                numbers[b + 1] = numbers[b];
                --b;
            }
            numbers[b + 1] = temp;
            ++a;
        }

        // This will display the results orders
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}