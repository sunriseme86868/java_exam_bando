import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
    LocalDateTime ieyasu = LocalDateTime.of(1543,02,10,05,12,00);

    System.out.println("徳川家康の誕生日は" + ieyasu + "です。");

    ieyasu = ieyasu.plusYears(1);
    ieyasu = ieyasu.plusMonths(2);
    ieyasu = ieyasu.plusDays(3);
    ieyasu = ieyasu.plusHours(4);
    ieyasu = ieyasu.plusMinutes(5);



    System.out.println("1年2ヶ月3日4時間5分後は"+ ieyasu + "です。");

    }
    

}
