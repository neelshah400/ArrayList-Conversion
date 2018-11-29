import java.util.ArrayList;

public class Conversion{

 	public static void main(String[]args){

		int num = 8950;
		System.out.println(num + " --> " + convertToArrayList(num));
 	}

 	public static ArrayList<Integer> convertToArrayList(int num){

 		ArrayList<Integer> list = new ArrayList<>();
		while(num >= 1){
			list.add(num % 10);
			num /= 10;
		}
		ArrayList<Integer> reverse = new ArrayList<>();
		for(int i = list.size() - 1; i >= 0; i--)
			reverse.add(list.get(i));
		return reverse;

 	}
 	public int ReConvert(ArrayList <Integer> list){
		return 1;
	}
 }
