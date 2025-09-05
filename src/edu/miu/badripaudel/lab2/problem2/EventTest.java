package edu.miu.badripaudel.lab2.problem2;

import java.time.Year;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nguyen Khanh Tran
 * @since 9/3/2025
 * <p>This is the assignment for lab 2, FPP course, MIU, IA</p>
 * Program name: <b>“Problem 1: Class & Objects”</b>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */
public class EventTest {

    private static ArrayList<Event> events = new ArrayList<>();
    private static ZonedDateTime zonedDateTime = ZonedDateTime.now();
    private static String timezone = zonedDateTime.getZone().getId();
    private static String now = DateUtils.formatLocalDate(zonedDateTime);

    public static void main(String[] args) {

        //MENU
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("##############################################");
            System.out.println("=====Global team schedule meetings system=====");
            System.out.println("Current time: " + now);
            System.out.println("###################MENU#######################");
            System.out.println("1.Create event");
            System.out.println("2.Show all events");
            System.out.println("3.Change Timezone");
            System.out.println("4.Exit");
            System.out.print("Please choose: ");
            switch (input.nextInt()) {
                case 1 -> createEvent();
                case 2 -> showAllEvents();
                case 3 -> changeCurrentTimeZone();
                case 4 -> System.exit(0);
            }
        }

    }

    private static void changeCurrentTimeZone() {
        System.out.println("======= 3.Change timezone====== ");
        System.out.println("Your current timezone: " + timezone);
        Scanner input = new Scanner(System.in);
        String localZone = ZonedDateTime.now().getZone().getId();
        System.out.println("1." + localZone);
        System.out.println("2." + TimeZoneEnum.AMERICA_PANAMA.toString());
        System.out.println("3." + TimeZoneEnum.AMERICA_CHICAGO.toString());
        System.out.println("4." + TimeZoneEnum.AMERICA_INDIANA_INDIANAPOLIS.toString());
        System.out.println("5." + TimeZoneEnum.AMERICA_SANTIAGO.toString());
        System.out.println("6." + TimeZoneEnum.AMERICA_PHOENIX.toString());
        System.out.println("7." + TimeZoneEnum.VIETNAM_HOCHIMINH.toString());
        System.out.print("Please choose your new timezone: ");
        int chose = input.nextInt();
        switch (chose) {
            case 1 -> timezone = localZone;
            case 2 -> timezone = TimeZoneEnum.AMERICA_PANAMA.toString();
            case 3 -> timezone = TimeZoneEnum.AMERICA_CHICAGO.toString();
            case 4 -> timezone = TimeZoneEnum.AMERICA_INDIANA_INDIANAPOLIS.toString();
            case 5 -> timezone = TimeZoneEnum.AMERICA_SANTIAGO.toString();
            case 6 -> timezone = TimeZoneEnum.AMERICA_PHOENIX.toString();
            case 7 -> timezone = TimeZoneEnum.VIETNAM_HOCHIMINH.toString();
            default -> timezone = localZone;
        }

        //Update timezone
        zonedDateTime = DateUtils.setNewTimeZone(zonedDateTime, timezone);
        now = DateUtils.formatLocalDate(zonedDateTime);

        System.out.println("Your current timezone was changed to: " + timezone);
    }

    private static void showAllEvents() {
        System.out.println("============ 2.Show all events ===============");
        if (events.isEmpty()) {
            System.out.println("No events");
        }
        for (int i = 0; i < events.size(); i++) {
            Event ev = events.get(i);
            StringBuilder builder = new StringBuilder();
            builder.append("*No:").append(i + 1);
            builder.append("\n*Name:").append(ev.getName());

            ZonedDateTime dateWithNewZone = DateUtils.setNewTimeZone(ev.getEventDate(), timezone);

            builder.append("\n*Event date:").append(DateUtils.formatLocalDate(dateWithNewZone));
            builder.append("\nUp coming after (Based on number of hours): ").append(ChronoUnit.DAYS.between(ZonedDateTime.now(), dateWithNewZone)).append(" day(s)");
            builder.append("\nLeap year:").append(Year.of(dateWithNewZone.getYear()).isLeap());
            builder.append("\n=========================================");
            System.out.println(builder.toString());
        }
    }

    private static void createEvent() {
        System.out.println("=============== 1.Create event ===============");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter event name: ");
        String name = input.nextLine();
        ZonedDateTime newEventDate;
        while (true) {
            System.out.println("Enter event date yyyy-MM-dd HH:mm:ss or \"Now\": ");
            try {
                String date = input.nextLine();
                if("now".equalsIgnoreCase(date)) {
                    newEventDate = DateUtils.setNewTimeZone(ZonedDateTime.now(), timezone);
                }
                else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                            .withZone(zonedDateTime.getZone());
                    newEventDate = ZonedDateTime.parse(date, formatter);
                }
                break;
            }
            catch (Exception e){
                System.out.println("Invalid date.....Try again...:");
            }
        }

        Event newEvent = new Event(name, newEventDate);
        events.add(newEvent);
    }
}
