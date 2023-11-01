package teacher_code;


class TeacherCode {
    public static void main(String[] args) {
        Gym ilyas = new Gym();
        ilyas.setTowel("green towel");

        Gym sandor = new Gym();
        sandor.setTowel("blue towel");

        sandor.setWeights("100 kg!");
        sandor.doExercise();
        sandor.takeCare();


        ilyas.setWeights("60 kg!");
        ilyas.doExercise();

        sandor.doExercise();

        ilyas.takeCare();


        Gym.setWeights("20");

        ilyas.doExercise();

        Gym.doExercise();
        new NewGym().doExercise();
    }


    private static class SomeClass {
        public static int x;
    }
}

