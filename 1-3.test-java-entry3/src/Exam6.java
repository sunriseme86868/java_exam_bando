public class Exam6 {
    public static void main(String[] args) {
        /*間違い　int answer =calc(5,4,'-');
        System.out.println(answer);
        */

        System.out.println("結果: " + calc(2, 3, '+')); // 5
        System.out.println("結果: " + calc(8, 2, '-')); // 6
        System.out.println("結果: " + calc(5, 4, '*')); // 20
        System.out.println("結果: " + calc(7, 2, '/')); // 3
        System.out.println("結果: " + calc(3, 8, '@')); // -1
    }

    public static int calc(int num1, int num2, char op) {
        // if文による分岐
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num1 / num2;
        } else {
            // どれにも当てはまらない（+ - * / 以外）場合
            return -1;
        }
    }
}

        /* ◼︎正解別バージョン
        public static int calc(int num1, int num2, char op) {
        int result;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // 整数同士の計算なので、端数は切り捨てられます
                result = num1 / num2;
                break;
            default:
                // 指定された演算子以外の場合は-1を返す
                return -1;
        }

        return result;
        */



    /*間違い　
    static int calc(int num1,int num2,char c){
*    int answer=0;
        if(!(c =='+'|| c=='-'|| c=='*'||c=='/')){
        return(-1);
        }else{
        answer =(num1+ 'c' + num2);
        }
        return answer;
        char文章は演算子にならないので、if文もしくはswitch文で計算し直しする。

    */
