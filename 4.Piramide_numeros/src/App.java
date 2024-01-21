public class App {
    public static void main(String[] args) {
        int maxValue = 5;

        for(int i=1; i <= maxValue; i++) {
            String line = Integer.toString(i);
            for(int j = 1; j < i; j++) {
                line += i;
            }
            
            System.out.println(line);
        }
    }
}