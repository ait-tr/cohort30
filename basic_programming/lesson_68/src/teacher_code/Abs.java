package teacher_code;

public abstract interface Abs {


    // этот метод должен выводить в консольлогику работы вашего класса
    abstract void someMethod();


    // данный метод должен служить для логирования, принимает информацию, котору слудет залогировать
    abstract void logging(String message);
}
