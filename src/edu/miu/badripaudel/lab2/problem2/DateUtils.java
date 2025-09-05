package edu.miu.badripaudel.lab2.problem2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Nguyen Khanh Tran
 * @since 9/3/2025
 * <p>This is the assignment for lab 2, FPP course, MIU, IA</p>
 * Program name: <b>“Problem 1: Class & Objects”</b>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */
public class DateUtils {
    public static String formatLocalDate(ZonedDateTime localDate) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(localDate.getDayOfWeek());
//        sb.append(", ");
//        sb.append(localDate.getMonth());
//        sb.append(" ");
//        sb.append(localDate.getDayOfMonth());
//        sb.append(", ");
//        sb.append(localDate.getYear());
//        sb.append(" @ ");
//        sb.append(localDate.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
//        sb.append(" [");
//        sb.append(localDate.getZone());
//        sb.append("]\n");
//
//        sb.append();
//        return sb.toString();
        return localDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, YYYY @ HH:mm:ss @@@VV!!!")).replace("@@@","[").replace("!!!","]");
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

    public static ZonedDateTime setNewTimeZone(ZonedDateTime localDate, String timeZone) {
        //Init
        ZonedDateTime zonedDateTime = null;
        try {
            zonedDateTime = localDate.withZoneSameInstant(ZoneId.of(timeZone));
        } catch (Exception e) {
            zonedDateTime = ZonedDateTime.ofInstant(localDate.toInstant(), ZoneId.of(timeZone));
        }
        return zonedDateTime;
    }

}
