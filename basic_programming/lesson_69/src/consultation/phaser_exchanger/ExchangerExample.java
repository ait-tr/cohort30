package consultation.phaser_exchanger;

import java.util.concurrent.Exchanger;


/**
 * Exchanger используется для точки обмена данных между двумя потоками. Каждый поток представляет некоторые данные на
 * точке обмена и, при встрече с другим потоком, получает данные, представленные этим потоком.
 * <p>
 * Основные особенности Exchanger:
 * <p>
 * Позволяет двум потокам обмениваться объектами. Блокирует поток, пока другой поток не придет на точку обмена.
 */
public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new MyExchangerThread(exchanger, "A")).start();
        new Thread(new MyExchangerThread(exchanger, "B")).start();
    }
}



