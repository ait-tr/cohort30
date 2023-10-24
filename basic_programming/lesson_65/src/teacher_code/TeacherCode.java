package teacher_code;


public class TeacherCode {
    private int size;

    private static long length;

    public static void main(String[] args) {
        TeacherCode one  = new TeacherCode();
        TeacherCode two  = new TeacherCode();
        TeacherCode three = new TeacherCode();

        one.setSize(1);
        two.setSize(2);
        three.setSize(3);

        one.setLength(35l);
        two.setLength(45l);
        three.setLength(55l);

        three.setSize(10);

        System.out.println("one.getSize() = " + one.getSize());
        System.out.println("two.getSize() = " + two.getSize());
        System.out.println("three.getSize() = " + three.getSize());

        System.out.println("one.getLength() = " + one.getLength());
        System.out.println("two.getLength() = " + two.getLength());
        System.out.println("three.getLength() = " + three.getLength());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }

    public static long getLength() {
        return length;
    }

    public static void setLength(long _length) {
        length = _length;
    }
}




