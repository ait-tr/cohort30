public class JsonWrapper2Appl {

    public static void main(String[] args) {

        // упаковываем
        JsonWrapper2<Long> wrapper2 = new JsonWrapper2<>(10l);
        System.out.println(wrapper2);

        //разупаковываем
        Long a = wrapper2.getValue();
        System.out.println(a);

    }

}
