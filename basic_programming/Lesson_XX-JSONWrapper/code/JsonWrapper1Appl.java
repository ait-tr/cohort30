

public class JsonWrapper1Appl {
    public static void main(String[] args) {

        // упаковываем
        JsonWrapper1 wrapper1 = new JsonWrapper1("10");
        System.out.println(wrapper1);
        // разупаковываем
        Integer a = (Integer) wrapper1.getValue();
        System.out.println(a);
    }
}
