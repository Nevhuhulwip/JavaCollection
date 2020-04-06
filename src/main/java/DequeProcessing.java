import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class DequeProcessing {
    int process(ArrayDeque<Integer> deque, int subsetSize){
        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();

        int subsetsNumber = deque.size() - subsetSize + 1;

        for (int i = 0; i < subsetsNumber; i++) {
            Object[] deqAsArray = deque.toArray();
            int loopCount = deque.size()-1;
            for (int j = 0; j < subsetSize; j++) {
                duplicate.add((Integer) deqAsArray[loopCount-j]);
                   }
              deque.removeLast();

            uniqueSizesList.add(duplicate.size());

            duplicate.clear();
        }
        return MaxNum(uniqueSizesList);
    }
     int MaxNum(ArrayList<Integer> uniqueSizes){
		int maximum = 0;
		for(Integer num : uniqueSizes){
			if(num > maximum){
				maximum = num;
			}
		}
		return maximum;
	}
}
