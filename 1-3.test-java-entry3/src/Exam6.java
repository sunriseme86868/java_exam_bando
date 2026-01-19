public class Exam6 {
    public static void main(String[] args) {
        int answer =calc(5,4,'-');
        System.out.println(answer);
    }

    static int calc(int num1,int num2,char c){
        int answer=0;
        if(!(c =='+'|| c=='-'|| c=='*'||c=='/')){
        return(-1);
        }else{
        answer =(num1+ c + num2);
        }
        return answer;
        


    }
}
