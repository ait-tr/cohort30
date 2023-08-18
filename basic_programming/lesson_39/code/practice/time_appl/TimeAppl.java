package practice.time_appl;
// нет полей
// нет конструкторов
// нет сеттеров и геттеров
// есть метод main

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
//        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // вернули дату и время в международном формате 2023-08-16T21:03:52.341453

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());

        System.out.println("Gagarin Day of month " + gagarin.getDayOfMonth());
        System.out.println("Gagarin Day of week " + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDate)); // ожидаем true
        System.out.println(gagarin.isAfter(currentDate)); // ожидаем false

        System.out.println("=====Traveling In Time===========");
        // add days to current day

        LocalDate newDate = currentDate.plusDays(40);
        System.out.println(newDate);

        newDate = currentDate.plusWeeks(12);
        System.out.println("Add 12 weeks: " + newDate);

         // 2 month ago
        newDate = currentDate.minusMonths(2);
        System.out.println("Two month ago: " + newDate);

        // operations with CronoUnits
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS)); // сколько половинок дней прошло
        // CENTURE - 100 лет
        newDate = currentDate.plus(10, ChronoUnit.CENTURIES);
        System.out.println("After 10 centuries: " + newDate);

        // получение интервала времени
        LocalDate lenin = LocalDate.of(1870, 4, 22);
        long res = ChronoUnit.YEARS.between(gagarin, lenin);
        System.out.println("День рождения Ленина - день старта Гагарина (в годах): " + res);

        System.out.println("Compare LocalDate");
        System.out.println(lenin.compareTo(gagarin)); // сравнение дат

        // LocalDate array sorting
        LocalDate[] dates = {gagarin, currentDate, lenin};
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        System.out.println("===== Date Formatter =====");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd-MMM-yy");
        System.out.println(gagarin.format(df));
        System.out.println("===== Date Formatter =====");
        String date1 = "06/07/2023";
        System.out.println(date1);
        // String date2 = "2023-02-02";

        LocalDate localDate1 = dateParse(date1);
        System.out.println(localDate1);
        df  = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(localDate1.format(df));

        // LocalDate localDate2 = dateParse(date2);
        // System.out.println(localDate2);
    }
    private static LocalDate dateParse(String date) {
       // DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy]");
        return LocalDate.parse(date, df);
//        if (date.contains("-")) {
//            return LocalDate.parse(date);
//        } else {
//            return LocalDate.parse(date, df);
//        }

    }



}
