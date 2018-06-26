package trials.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {

		//creating data to work with
		List<Integer> intList = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0; i<10; i++) {
			intList.add(random.nextInt(100));
		}
		
		System.out.println("For Each loop");
		for (Integer i : intList) {
			System.out.println("integer value:" + i);
		}
		
		System.out.println("For Each method with anonymous Consumer class");
		intList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer arg0) {
				System.out.println("integer value:" + arg0);
			}
			
		});
		
		System.out.println("For Each method with implemented Consumer class");
		MyConsumer looper = new MyConsumer();
		intList.forEach(looper);
	}

}

//This could be a seperate class
class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("integer value:" + t);
	}
	
}
