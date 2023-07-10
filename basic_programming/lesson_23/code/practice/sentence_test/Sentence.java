package practice.sentence_test;

public class Sentence {
    // поля класса

    public Sentence(String sentence) {
        this.sentence = sentence;
    }
    // методы класса
    // конструктор
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    // метод 1 - кол-во слов
    public int wordsInSentence (String sentence){
        String[] words = sentence.split(" ");
        int qWords = words.length;
        System.out.println("There are " + qWords + "  words in the sentence.");
        return qWords;
    }

    // метод 2 - количество букв
    public int lettersInSentence (String sentence){
        String[] letters = sentence.replaceAll("[^а-яА-Яa-zA-Z0-9]", "").split("");
        System.out.println("There are " + letters.length + "  letters in the sentence.");
        return letters.length;
    }
}



/*

          String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";


        String[] symbols = sentence.split("");
        int qSymbols = symbols.length;
        System.out.println("There are " + qSymbols + " symbols in the sentence.");

        int countOfLetters = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char с = words[i].charAt(j);
                if ( с == ',' || с == '.' || с == '-' || с == '!' || с == '?' || с == '"'){
                    continue;
                }
                countOfLetters++;
            }
        }



 */
