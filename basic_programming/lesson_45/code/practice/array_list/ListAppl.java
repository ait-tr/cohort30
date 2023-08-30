package practice.array_list;

public class ListAppl {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(20);
        list.add(70);
        list.add(30);
        list.add(50);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(70);
        System.out.println(list.size());
        System.out.println(list.get(4));
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(80));
        System.out.println(list.contains(50));
        System.out.println(list.contains(55));

        System.out.println("=========================");

        IList<String> myCityList = new MyArrayList<>();
        myCityList.add("Tashkent");
        myCityList.add("Derbent");
        myCityList.add("Sverdlovsk");
        myCityList.add("Budapest");
        myCityList.add("Kiev");

        System.out.println(myCityList.get(3));
     //   System.out.println(myCityList.get(-100));
        System.out.println(myCityList.contains("Kiev"));
        System.out.println(myCityList.contains("New York"));

        System.out.println(myCityList.size());
        myCityList.remove(1);
        System.out.println(myCityList.size());

    }
}
