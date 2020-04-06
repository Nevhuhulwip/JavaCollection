import java.util.ArrayDeque;
import java.util.Deque;

public class MainProgram {
    public static void main(String[] args) {

        DequeInput DI = new DequeInput();
            DequeProcessing DP = new DequeProcessing();


        int dequeSize = DI.getSize();
        int sizeOfSubset = DI.getSubsetSize();

        Deque<Integer> deque =DI.getDeque();
        System.out.println("-------------------------------------------");

            int output = DP.process((ArrayDeque<Integer>) deque, sizeOfSubset);
            System.out.println(output);
        System.out.println("--------------------------------------------");
    }

}
