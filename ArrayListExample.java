import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.printf("First number from collection %s is: %s\n",numbers,numbers.get(0));

        System.out.printf("Primer ispisa 1: %s\n", numbers);
        for(Integer s : numbers) {
            System.out.println(s);
        }

        numbers.remove(numbers.size() - 2);

        System.out.printf("Primer ispisa 2: %s\n",numbers);
        for(int i = 0; i < numbers.size() ;i++) {
            System.out.printf("%s\n",numbers.get(i));
        }
    }
}
