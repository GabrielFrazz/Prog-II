import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for(int i = 1; i <= 50; i++){
            numbers.add(rand.nextInt(0, 99));
        }

        Collections.sort(numbers);

        System.out.println("Menor valor: " + numbers.get(0)); //menor valor
        System.out.println("Maior valor: " + numbers.get(49)); //maior valor

        System.out.println();
        List<Integer> smallestValue = numbers.stream().filter(x -> x == numbers.get(0)).collect(Collectors.toList());
        System.out.println("o menor valor aparece " + smallestValue.size() + " vezes");

        System.out.println();
        System.out.println("lista de numeros: ");
        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
