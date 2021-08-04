import  java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		int[] arr = {7, 14, 21, 25, 25, 7, 28, 45, 14, 7};
		System.out.println("WIth duplicates : " +Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		Collections.sort(list);
		System.out.println("Without Duplicated : " +list);
	}

}