public class Exam5 {
    public static void main(String[] args) {
        int num =addition(5,3);
        int num2 =subtraction(5,3);
        int num3 =multiplication(5,3);
        int num4 =division(5,3);
        int num5 =remainder(5,3);
        
        System.out.println("足し算結果:"+num);
        System.out.println("引き算結果:"+num2);
        System.out.println("掛け算結果:"+num3);
        System.out.println("割り算結果:"+num4);
        System.out.println("剰余算結果:"+num5);
    }

    static int addition(int num1, int num2){
        int answer =num1+num2;
        return answer;
    }
        static int subtraction(int num1, int num2){
        int answer =num1-num2;
        return answer;
    }
        static int multiplication(int num1, int num2){
        int answer =num1*num2;
        return answer;
    }
        static int division(int num1, int num2){
        int answer =num1/num2;
        return answer;
    }
        static int remainder(int num1, int num2){
        int answer =num1%num2;
        return answer;
    }



}
