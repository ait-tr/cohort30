package teacher_code;

public class TempFuncInterfaceImpl implements TempFuncInterface{
    @Override
    public void temp(int x) {
        if (x % 2 == 0) {
            System.out.println("Class it is even number");
        } else {
            System.out.println("Class it is odd number");
        }
    }
}
