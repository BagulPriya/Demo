package challenges;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallange {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<String> grocerylist = new ArrayList<>();
		while (flag) {
			printActions();
			switch (Integer.parseInt(sc.nextLine())) {
				case 1->addItems(grocerylist);
				case 2->removeItems(grocerylist);
				default -> flag = false;
			}
			grocerylist.sort(Comparator.naturalOrder());
			System.out.println(grocerylist);

		}
	}
	private static void addItems(ArrayList<String> grocerylist) {
		System.out.println("Add item(s) [separate items by comma] : ");
		String[] items = sc.nextLine().split(",");
		//grocerylist.addAll(List.of(items));
		for(String i:items){
			String trimmed=i.trim();
			if(grocerylist.indexOf(trimmed)<0){
				grocerylist.add(trimmed);
			}
		}
	}
	private static void removeItems(ArrayList<String> grocerylist) {
		System.out.println("Remove item(s) [separate items by comma] : ");
		String[] items = sc.nextLine().split(",");
		for(String i:items){
			String trimmed=i.trim();
			grocerylist.remove(trimmed);
			}
	}
	private static void printActions() {
		String textBlock= """
				Available actions:
				0-To shutdown
				1-to add items to list
				2-to remove any items
				Enter a number for which action you want to do: """;
			System.out.println(textBlock + " ");
		}




	}


