public class Main {
    public static void main(String[] args) {

        int[] array = {5, 2, 1, 9};
        System.out.println(maxElement(array));

        System.out.println(difElement(array));
    }
// Дан массив целых чисел ( не пустой) . Написать метод, возвращающий наибольший элемент  этого массива .

    // { 5,2,9,1} -> 9

    public static int maxElement(int[] array) {
        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];

            }


        }
        return maxNum;
    }
    // Дан массив целых чисел ( не пустой) . Написать метод, возвращающий разницу между наибольшим и наименьшим
    //  элементами  этого массива .

    // { 5,2,9,1} -> 8
    public static int difElement(int[] array) {
        int maxNum = 0;
        int sum = 0;
        int minNum = array[0];


        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxNum) {
                maxNum = array[i];

            }


        }

        for (int j = 0; j < array.length; j++) {

            if (array[j] < minNum) {
                minNum = array[j];
            }
        }

        sum = maxNum - minNum;

        return sum;
    }


}