public class Main {
    public static void main(String[] args) {
        //Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue
        //Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
        //{3, 2, -1, 5, -3} ->10

        int[] array;
        array = new int[10];
        int maxvalue = 1;
        int[] arr1 = {3, 2, -1, 5, -3};
        printArray(array);
        System.out.println("----------------------------------------");
        printArr1(arr1);


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] +=i;
            System.out.println(array[i]);
        }


    }

    public static void printArr1(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                sum += arr1[i];

            }
        }
        System.out.println(sum);
    }
}
