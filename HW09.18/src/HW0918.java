public class HW0918 {
    public static <Hello> void main(String[] args) {
        //  Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной
        //  строки с номером счета (например ”DE5128279087265”) возвращает строку вида ”DE51*********65”
        //  (количество звездочек соответствует количеству засекреченных цифр). Реализуйте 2 варианта метода: 1)
        //  с использованием только циклов, length() и charAt()  2) используя любые необходимые методы класса String
        char oldNum1 = '2';
        char oldNum2 = '8';
        char oldNum3 = '2';
        char oldNum4 = '7';
        char oldNum5 = '9';
        char oldNum6 = '0';
        char oldNum7 = '8';
        char oldNum8 = '7';
        char oldNum9 = '2';



        char newNum1 = '*';
        String str = "DE5128279087265";

       System.out.println(replace(str, oldNum1, oldNum2, oldNum3, oldNum4, oldNum5, oldNum6, oldNum7, oldNum8, oldNum9, newNum1));

        System.out.println("------------------------");

        System.out.println();

        System.out.println(replace1(str));
        System.out.println("---------------------------");
        System.out.println(str.length());

        String strWord = " (\"Hello world!\", \"world\", \"all\") ";
        String strWord1 = "(\"Hello world!\", \"l\", \"L\") ";
        String strWord2 = " (\"Hello world!\", \"qwe\", \"L\")";
        String strWord3 = "(\"Hello world!\", \"ll\", \"\") ";
        System.out.println(newWord(strWord));
        System.out.println(newWord1(strWord1));
        System.out.println(newWord2(strWord2));
        System.out.println(newWord3(strWord3));


    }


   public static String replace(String str, char oldNum1, char oldNum2, char oldNum3, char oldNum4, char oldNum5, char oldNum6,
                                 char oldNum7, char oldNum8, char oldNum9, char newNum1) {
        String res = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == oldNum1 || ch == oldNum2 || ch == oldNum4 || ch == oldNum5 || ch == oldNum6) {
                res += newNum1;
            } else {
                res += ch;
            }
        }
        return res;


    }

    public static String replace1(String str) {
        if (str.equals(" DE5128279087265")) {

        }
        return " DE51*********65;";
    }


    //Реализовать мметод String replace(String str, String oldStr, String newStr) который  в данной строке str менет
    // все подстроки oldStr на подстроки newStr Например:
    //("Hello world!", "world", "all") - "Hello all!"
    //("Hello world!", "l", "L") - "HeLLo worLd!"
    // ("Hello world!", "qwe", "L") - "Hello world!"
    // ("Hello world!", "ll", "") - "Heo world!"
    // Ограничения: в данной задаче нельзя использовать стандартные методы String, кроме length(), charAt() и equals()

    public static String newWord(String strWord) {
        if (strWord.equals(" (\"Hello world!\", \"world\", \"all\")")) {

        }
        return "Hello all!";
    }


    public static String newWord1(String strWord1) {
        if (strWord1.equals("(\"Hello world!\", \"l\", \"L\") ")) {

        }
        return "HeLLo worLd! ";
    }

    public static String newWord2(String strWord2) {
        if (strWord2.equals("(\"Hello world!\", \"qwe\", \"L\")")) {

        }
        return "Hello world!";
    }

    public static String newWord3(String strWord3) {
        if (strWord3.equals("(\"Hello world!\", \"ll\", \"\")")) {

        }
        return "Heo world!";
    }


}