package ait.tr.lesson.two;

public class Main {

  public static void main(String[] args) {

    //1. Переменные пишутся только латинскими(английскими) буквами
    //2. Имя переменной должно быть "говорящим" о задаче этой переменной
    //3. Имя переменной не может начинаться с цифр
    //4. Snake case: int age_pension;
    //   Camel case: int agePension;
    //5. Нельзя использовать в названиях переменных зарезервированные слова:
    /*
     abstract, assert, boolean, break, byte, case, catch, char, class, const, continue,
      default, do, double, else, enum, extends, false, final, finally, float, for, goto,
       if, implements, import, instanceof, int, interface, long, native, new, null,
       package, private, protected, public, return, short, static, strictfp, String,
        super, switch, synchronized, this, throw, throws, transient, true, try, void,
        volatile, while
     */

    //возраст выхода на пенсию
    //обьявили переменную по типу int
    int age_pension_number; //Camel case: agePensionNumber;
    String age_pension_text;
    //присвоили значение 65 переменной age_pension
    //присвоили значение "Возраст выхода на пенсию " переменной age_pension_text
    age_pension_number = 65;
    age_pension_text = "Возраст выхода на пенсию: ";
    System.out.println(age_pension_text + age_pension_number);

    //возраст поступления в университет
    //обьявили переменную по типу int и присвоили ей значение 20
    int ageUni = 20;
    String agePensionText = "Возраст поступления в университет ";
    System.out.println(agePensionText + ageUni);

    System.out.println(1 + 3); //4
    System.out.println("1" + "3");//13
    System.out.println(1 + "3");//13
    System.out.println(1 + (1 + 3));//5
    System.out.println("1" + (1 + 3));//14
    System.out.println(45 + 5 + "=" + 45 + 5);//50=455
    System.out.println(45 + 5 + "A" + (45 + 5));//50A50

    int salaryBrutto = 5000;
    String salaryBruttoText = "Зарплата брутто в размере ";
    System.out.println(salaryBruttoText + salaryBrutto);

    //церковный налог
    int churchTax = 60;

    //подоходный налог
    int salaryTax = 490;

    //взнос в пенсионный фонд
    int pensionTax = 460;

    //налог в фонд безработицы
    int unemploymentTax = 65;

    //медицинская страховка
    int medicalTax = 400;

    //налог по уходу
    int careTax = 95;

    String taxText = "Сумма выплаченных налогов ";
    //общая сумма налогов
    int tax = churchTax + salaryTax + pensionTax + unemploymentTax + medicalTax + careTax;
    System.out.println(taxText + tax);

    String salaryNettoText = "На банковский счет приходит данная сумма ";
    //итоговая сумма, поступающая на банковский счет программиста
    int salaryNetto = salaryBrutto - tax;
    System.out.println(salaryNettoText + salaryNetto);

  }//закрываем метод main
}//закрываем класс  Main

