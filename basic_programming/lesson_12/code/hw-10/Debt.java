public class Debt {
    public static void main(String[] args) {
        System.out.println("Businessman's debt");

        double ssuda = 10000000;
        double procent = 10.0;
        double debt = 50000000;

        double sum = 0;
        int year = 1;

        while (sum < debt) {
            sum = (year == 1) ? ssuda + ssuda*procent : sum + sum * procent;
            year ++;
        }
        System.out.println("After " + year + " debt will be more than " + debt + ".");
    }
}

//    int loanAmount = 100;  // сумма ссуды в тысячах рублей
//    int interestRate = 10;  // годовая процентная ставка
//    int targetAmount = 150;  // целевая сумма в тысячах рублей
//    double debt = loanAmount;  // текущая сумма долга
//    int years = 0;  // количество пройденных лет
//        while (debt <= targetAmount) {
//                double interest = debt * interestRate / 100;  // сумма процентов за год
//                debt += interest;  // обновление суммы долга
//                years++;  // увеличение счетчика лет
//                }
//                System.out.println("Через " + years + " лет долг превысит " + targetAmount + " тысяч рублей.");