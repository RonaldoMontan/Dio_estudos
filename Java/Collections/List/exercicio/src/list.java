import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) throws Exception {
        

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(2.5);
        notas.add(7.2);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(5.0);

        System.out.println(notas.size());
    }
}
