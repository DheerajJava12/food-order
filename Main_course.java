package food_order;

import java.util.Scanner;

class Main_course {
	Scanner sc=new Scanner(System.in);
	int choice,total;
	String menu_item;
	void item() {
		System.out.println(" 1 : Veg. pulav \t Rs 110");
		System.out.println(" 2 : Veg.biryani \t Rs 120 ");
		System.out.println(" 3 : Paneer pulav \t Rs 130");
		System.out.println(" 4 : Paneer biryani \t Rs 140");
		System.out.print(" choose option : \n");
		choice=sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("veg. pulav \t Rs 110 \n");
			menu_item="veg pulav \t Rs 110";
			total+=110;
			break;
		case 2 :
			System.out.println("veg. biryani \t Rs 120 \n");
			menu_item="veg  biryani \t Rs 120";
			total+=120;
			break;
		case 3 :
			System.out.println("paneer pulav \t Rs 130 \n");
			menu_item="panner pulav \t Rs 130";
			total+=130;
			break;
		case 4 :
			System.out.println("paneer biryani \t Rs 140 \n");
			menu_item="paneer biryani \t Rs 140";
			total+=140;
		}
	}

}
