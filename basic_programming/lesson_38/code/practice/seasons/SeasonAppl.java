package practice.seasons;

//Опробовать методы:
//        .length
//        .valueOf
//        .name
//        .original()


public class SeasonAppl {
    public static void main(String[] args) {

        Season season = Season.WINTER;
        System.out.println(season);
        System.out.println(Season.AUTUMN);

        System.out.println(season.name());

        System.out.println("============values============");
        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        System.out.println("============original==========");
        System.out.println(season.name());
        System.out.println(season.ordinal()); // ordinal - порядковый номер в списке enum
        System.out.println(season.SPRING.ordinal());
        System.out.println(season.AUTUMN.ordinal()); // ожидаем 3
    }
}
