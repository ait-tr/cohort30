package teacher_code;

public  class NewGym extends Gym {
    @Override
    public void takeCare() {
        System.out.println("переопределенный метод");
        System.out.println(getWeights());
    }


    public static void doExercise() {
        System.out.println("переопределили" +
                " статический метод");
    }
}
