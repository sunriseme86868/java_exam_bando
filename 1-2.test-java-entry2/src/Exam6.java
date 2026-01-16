public class Exam6 {
    public static void main(String[] args) {
        int answer =0;
        for(int i =1;i<10;i++){
            for(int j=1;j<10;j++){
                answer=i*j;
                if(answer<10){
                    System.out.print(" "+answer);
                }else{
                  System.out.print(answer);  
                }
            }
            System.out.println("");
        }
    }

}
