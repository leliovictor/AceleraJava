public class App {
    public static void main(String[] args) throws Exception {
        
        int number = -4;

        if(number == 0) {
            System.out.println("Seu número é zero");
        } else {
            String sign = number > 0 ? "positivo" : "negativo";
            String oddOrEven = number % 2 == 0 ? "par" : "ímpar";

            System.out.println(number + " é " + oddOrEven + " e " + sign + ".");
        }
    }
}
