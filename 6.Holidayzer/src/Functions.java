import java.util.List;

public class Functions {
    public static void findData(String day) {
        int index = Holidays.data.indexOf(day);
        if(index == -1) System.out.println("Nao existe feriado com tal data");

        System.out.println(Holidays.holiday.get(index));
    }

    public static void allHolidays() {
        System.out.println("Lista com todos os feriados registrados:");
        for(int i = 0; i < Holidays.data.size(); i++) {
            System.out.println(Holidays.data.get(i) + " => " + Holidays.holiday.get(i));
        }
    }
    
}