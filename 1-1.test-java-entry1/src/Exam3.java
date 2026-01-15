public class Exam3 {
    public static void main(String[] args) {
        int a =200;
        int b =250;
        double TAX = 0.1;
        int total =a*3+b*4;
        int syoHizei =(int)(total*TAX);
        int gouKei =total+syoHizei;

        System.out.println("小計");
        System.out.println(total+"円");
        System.out.println("消費税");
        System.out.println(syoHizei+"円");
        System.out.println("合計金額");
        System.out.println(gouKei+"円");

    }

}
