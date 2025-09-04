package edu.miu.badripaudel.lab2.problem2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String formatLocalDate(ZonedDateTime localDate) {
        StringBuilder sb = new StringBuilder();
        sb.append(localDate.getDayOfWeek());
        sb.append(", ");
        sb.append(localDate.getMonth());
        sb.append(" ");
        sb.append(localDate.getDayOfMonth());
        sb.append(", ");
        sb.append(localDate.getYear());
        sb.append(" @ ");
        sb.append(localDate.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        sb.append(" [");
        sb.append(localDate.getZone());
        sb.append("]\n");

        sb.append(localDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, YYYY @ HH:mm:ss [VV]")));
        return sb.toString();
    }

    public static String convertDateWithTimeZone(ZonedDateTime localDate, String timeZone) {
        //Init
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(localDate.toInstant(), ZoneId.of(timeZone));
        try {
            zonedDateTime = localDate.withZoneSameInstant(ZoneId.of(timeZone));
        } catch (Exception e) {
            return "Invalid date or time zone";
        }
        return formatLocalDate(zonedDateTime);
    }


    public static void main(String[] args) {
        System.out.println(formatLocalDate(ZonedDateTime.now()));

        System.out.println(convertDateWithTimeZone(ZonedDateTime.now(), "Asia/Ho_Chi_Minh"));
    }

}
