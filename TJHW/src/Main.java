public class Main {
    public static void main(String[] args) {

    // Написать метод, возвращающий целое число равное двойной длине строки,
        // принимаемой в качестве аргумента метода.  Пример: hello -> 10
        String str="hello";
        System.out.println(calcStr("hello"));
    }
    public static int calcStr(String str){
        int sum=0;
        for (int i=0;i <=str.length();i++){
            sum=i+str.length();


        }
        return sum;
    }
}