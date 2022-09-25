public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, -1, -5, 4, 9};
        System.out.println(minValue(array));
        String[] str = {"qwe", "axcvbn", "qwertyuio", "qas"};
        System.out.println(lineValue(str));


    }

    // Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве.
    //  Например: {1,3,6,-1,4,-5,9} -> -5

    public static int minValue(int[] array) {
        int minNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minNum = array[i];
                array[i] += i;
            }
        }
        return minNum;
    }

    //Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.
    //Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2

    public static String lineValue(String[] str) {
        String maxValue = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxValue.length())

                maxValue = str[i];

        }
        return maxValue;
    }


}
