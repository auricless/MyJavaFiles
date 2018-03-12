import java.util.ArrayList;
import java.util.List;

public class StringArraySort {

	public static void main(String[] args) {
		
		List<String> fruitsArray = new ArrayList<>();
		fruitsArray.add("Apple");
		fruitsArray.add("Watermelon");
		fruitsArray.add("Banana");
		
		fruitsArray.sort(null);
		
		for(String fruit: fruitsArray) {
			System.out.println(fruit);
		}
		
	}

}
