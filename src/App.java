import java.util.Scanner;

import com.shopping.fruits.Fruit;
import com.shopping.fruits.Vegitables;
public class App

{
	public static void main(String[] args)
	{
		Fruit apple=new Fruit("apple",10,100);
		Fruit orange=new Fruit("orange",5,100);
		Fruit guava=new Fruit("guava",3,100);
		Fruit banana=new Fruit("banana",1,100);
		Fruit discount=new Fruit(5.0%100);

		Vegitables tameto=new Vegitables("tameto",15,10) ;
		Vegitables lemon=new Vegitables("lemon",5,1);
		Vegitables carret=new Vegitables("carret",8,10);
		Vegitables onion=new Vegitables("onion",20,10);
		Vegitables discount1=new Vegitables(6.3%100);

		int applebill=apple.getCost();
		int orangebill1=orange.getCost();
		int guavabill2=guava.getCost();
		int bananabill3=banana.getCost();

		int tametobill=tameto.getCost();
		int lemonbill=lemon.getCost();
		int  carretbill=carret.getCost();
		int onionbill=onion.getCost();

		
		/*int bill=apple.getCost()*5;
		int bill1=orange.getCost()*3;
		int bill2=guava.getCost()*5;
		int bill3=banana.getCost()*12;
		int finalbill=bill+bill1+bill2+bill3;




		System.out.println("apple bill is:"+ bill);
		System.out.println("orange bill is:"+bill1);
		System.out.println("guava bill is:"+bill2);
		System.out.println("banana bill is:"+bill3);
		System.out.println("the final bill is :"+finalbill);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the apple quantity");
		int apple1=sc.nextInt();
		System.out.println("enter the orange quantiry");
		int orange1=sc.nextInt();
		System.out.println("enter the guava quantiry");
		int guava1=sc.nextInt();
		System.out.println("enter the banana quantiry");	
		int banana1=sc.nextInt();
		System.out.println("enter the discount");
		double discount2=sc.nextInt();


		System.out.println("enter the tameto quantity");
		int tameto1=sc.nextInt();
		System.out.println("enter the lemon quantity");
		int lemoin1=sc.nextInt();
		System.out.println("enter the carret quantity");
		int carret1=sc.nextInt();
		System.out.println("enter the onion quantity");
		int onion1=sc.nextInt();
		System.out.println("enter the discount");
		double discount3=sc.nextInt();
		
		/*int	applequantity=apple.getCost();
		int orangequantity=orange.getCost();
		int guavaquantity=guava.getCost();
		int bananaquantity=banana.getCost();*/


		applebill=apple.getCost()*apple1;
		orangebill1=orange.getCost()*orange1;
		guavabill2=guava.getCost()*guava1;
		bananabill3=banana.getCost()*banana1;
		int fruitbalance=applebill+orangebill1+guavabill2+bananabill3;
		double discount4 =fruitbalance-discount2;

		tametobill=tameto.getCost()*tameto1;
		lemonbill=lemon.getCost()*lemoin1;
		carretbill=carret.getCost()*carret1;
		onionbill=onion.getCost()*onion1;
		int vegbalance=tametobill+lemonbill+carretbill+onionbill;
		double discount5=vegbalance-discount3;

		System.out.println("apple bill is:"+ applebill);
		System.out.println("orange bill is:"+orangebill1);
		System.out.println("guava bill is:"+guavabill2);
		System.out.println("banana bill is:"+bananabill3);
		System.out.println("total bill is: "+fruitbalance);
		System.out.println("after discount:"+discount4);


		System.out.println("tameto bill is: "+tametobill);
		System.out.println("lemon bill is: "+lemonbill);
		System.out.println("carret bill is :"+carretbill);
		System.out.println("onion bill is: "+onionbill);
		System.out.println("total bill is: "+vegbalance);
		System.out.println("after discount:"+discount5);

	}

	}
	
