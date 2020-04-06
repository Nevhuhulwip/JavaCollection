import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeInput {

    private Deque<Integer> deque = new ArrayDeque<>();
    private Scanner input = new Scanner(System.in);


    int getSize() {
        System.out.println("Enter number of deque : ");
        return input.nextInt();
    }

    int getSubsetSize() {
        System.out.println("Enter number of subset : ");
        int subsetSize = input.nextInt();
        input.nextLine();
        return subsetSize;
    }

    Deque<Integer> getDeque() throws NumberFormatException {
        System.out.println("Enter deque elements [ 4 5 8 0 0] : ");
        String element = input.nextLine();

        String[] intArray = element.split(" ");
        for (String strNum: intArray) {
            try {
                deque.add(Integer.parseInt(strNum));
            }catch (NumberFormatException e){
                System.out.println("Your input is invalid");
                throw new NumberFormatException();
            }
        }
        return deque;
    }
}
