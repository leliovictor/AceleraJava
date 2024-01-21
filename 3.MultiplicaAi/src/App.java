public class App {
    public static void main(String[] args) throws Exception {
        
        int number = 5;
        
        System.out.println("Tabela de multiplicação por " + number);
        for(int i = 1; i <= 10; i++)
        {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
