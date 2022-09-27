public class Main {
    public static void main(String[] args) {
        //Реализовать метод, который возвращает сколько раз заданная имя встречается в массиве начиная с позиции
        // start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
        //Например:
        //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
        //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
        //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3

        //Реализовать метод, который создает массив из первых n четных чисел, начиная с заданного числа start.
        // Например, для заданных n=4, start=21: {22,24,26,28}

        String[] strings = {"jack", "nick", "john", "jack", "tom", "john", "ann", "john "};
        String word = "john";
        System.out.println(countOccurrence(strings, word));
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrMassiv(array));



    }

    public static int countOccurrence(String[] strings, String word) {
        int replace = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == word) {
                replace++;
            }
        }

        return replace;
    }

    public static int arrMassiv(int[] array) {
        int newMassiv = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                newMassiv = array[i];
                array[i]++;
            }
        }
        return newMassiv;
    }
}








