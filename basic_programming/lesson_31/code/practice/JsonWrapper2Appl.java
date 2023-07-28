package practice;

public class JsonWrapper2Appl {
    public static void main(String[] args) {

        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("10");
        System.out.println(wrapper2);

        String a = wrapper2.getValue();
        System.out.println(a + "Привет" );

        JsonWrapper2<Integer> wrapper21 = new JsonWrapper2<>(101);
        System.out.println(wrapper21);

        int b = wrapper21.getValue();
        System.out.println(b * 10 );

    }
}
