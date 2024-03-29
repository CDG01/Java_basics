import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dateInJava {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-26T18:30:00+01:00");
        String data1Formatted = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.FULL));
        System.out.println(data1Formatted);
    }
}
