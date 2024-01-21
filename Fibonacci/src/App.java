import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int size = 6; // >= 1

        int nextNumber = 1;
        int lastNumber = 0;
        List<String> fiboArr = new ArrayList();
        fiboArr.add("0");

        for(int i = size; i > 1; i--) {
            fiboArr.add(Integer.toString(nextNumber));

            nextNumber = nextNumber + lastNumber;
            lastNumber = nextNumber - lastNumber;
        }

        System.out.println(String.join(" ", fiboArr));
    }
}
