public class Exam4 {
    public static void main(String[] args) {
        int num1 =Calculation.addition(5, 3);
        int num2 =Calculation.subtraction(5, 3);
        int num3 =Calculation.multiplication(5, 3);
        int num4 =Calculation.divison(5, 3);
        int num5 =Calculation.remainder(5, 3);

        System.out.println("足し算の結果："+num1);
        System.out.println("引き算の結果："+num2);
        System.out.println("掛け算の結果："+num3);
        System.out.println("割り算の結果："+num4);
        System.out.println("剰余算結果："+num5);
    }

}
