package fifteen.genericTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * ʹ��RandomList���������ֶ���Ĳ�ͬ���͵�Ԫ�أ�Ҫ�����main()�Ѿ��ù������
 */
public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<>();
	private Random rand = new Random(47);
	public void add(T item) { storage.add(item);}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public static void main(String args[]) {
		RandomList<Integer> randomList = new RandomList<>();
		for(Integer i : Arrays.asList(1, 2, 3, 5, 85)) {
			randomList.add(i);
		}
		
		for(int i = 0; i < 11; i++) {
			System.out.println(randomList.select() + " ");
		}
		
	}
}
