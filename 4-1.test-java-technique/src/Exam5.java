import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate mybirth = LocalDate.of(1995,1,31);
        int year = mybirth.getYear();
        int month = mybirth.getMonthValue();
        int day = mybirth.getDayOfMonth();
        System.out.println("私の誕生日は" + year + "年" + month +"月"+ day + "日です。" );

    }

}
