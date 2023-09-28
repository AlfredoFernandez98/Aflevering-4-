
 class Main {


public static void main ( String[] args){
	
	Team a1 = new Team("de Uovervindelige -");

	//1.i
	a1.setRanks(3);
		Team a2 = new Team("de Kæmpe -");

	//1.k
	a2.setRanks(1);

	Team a3 = new Team("de Seje -");

	a3.setRanks(2);

	Team a4 = new Team("de Mærkelige -");


	a4.setRanks(4);

	Team a5 = new Team("de Irritierende -");

	
	a5.setRanks(5);

	Team a6 = new Team("de Tykke -");

	
	a6.setRanks(6);



	System.out.println(a1.toString());
	System.out.println(a2.toString());
	System.out.println(a3.toString());
	System.out.println(a4.toString());
	System.out.println(a5.toString());
	System.out.println(a6.toString());
}
}