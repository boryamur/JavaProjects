public class SecondTask {

    public boolean isSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void getSimple(int num) {
        for (int i = 1; i <= num; i++) {
            if (isSimple(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
