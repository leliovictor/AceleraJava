import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> firstArr = Arrays.asList("Morango", "Banana", "Maçã", "Uva", "Caqui");
        List<String> secondArr = Arrays.asList("Manga", "Caqui", "Morango", "Amora");

        for(int i = secondArr.size() - 1; i >= 0; i--) 
        {
            String searchWord = secondArr.get(i);
            if(firstArr.contains(searchWord)) System.out.println(searchWord);
        }
    }
}
