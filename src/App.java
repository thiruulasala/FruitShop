import java.util.Scanner;

import com.shopping.fruits.Fruit;

public class App

{
	public static void main(String[] args)
	{
		Fruit apple=new Fruit("apple",10,100);
		Fruit orange=new Fruit("orange",5,100);
		Fruit guava=new Fruit("guava",3,100);
		Fruit banana=new Fruit("banana",1,100);
	
		int applebill=apple.getCost();
		int orangebill1=orange.getCost();
		int guavabill2=guava.getCost();
		int bananabill3=banana.getCost();

		
		int bill=apple.getCost()*5;
		int bill1=orange.getCost()*3;
		int bill2=guava.getCost()*5;
		int bill3=banana.getCost()*12;
		int finalbill=bill+bill1+bill2+bill3;
		System.out.println("apple bill is:"+ bill);
		System.out.println("orange bill is:"+bill1);
		System.out.println("guava bill is:"+bill2);
		System.out.println("banana bill is:"+bill3);
		System.out.println("the final bill is :"+finalbill);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the apple quantity");
		int apple1=sc.nextInt();
		System.out.println("enter the orange quantiry");
		int orange1=sc.nextInt();
		System.out.println("enter the guava quantiry");
		int guava1=sc.nextInt();
		System.out.println("enter the banana quantiry");	
		int banana1=sc.nextInt();
		
		/*int	applequantity=apple.getCost();
		int orangequantity=orange.getCost();
		int guavaquantity=guava.getCost();
		int bananaquantity=banana.getCost();*/
		bill=apple.getCost()*apple1;
		bill1=orange.getCost()*orange1;
		bill2=guava.getCost()*guava1;
		bill3=banana.getCost()*banana1;
		int balance=bill+bill1+bill2+bill3;

		System.out.println("apple bill is:"+ bill);
		System.out.println("orange bill is:"+bill1);
		System.out.println("guava bill is:"+bill2);
		System.out.println("banana bill is:"+bill3);
		System.out.println("total bill is: "+balance);
		
	}

	}
	
