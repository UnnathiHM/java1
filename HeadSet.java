class HeadSet{
	String brand;
	int price=3435;;
	String color;
	HeadSet(){
		System.out.println("default constructor");
	}
	HeadSet(String company){
		System.out.println("Invoking constructor");
		brand=company;
		System.out.println(brand);
	}
	HeadSet(String colour,int cost ){
		System.out.println("Invoking constructor");
		color=colour;
		price=cost;
		System.out.println(color+"\t"+cost);
	}
	HeadSet(String colour,int cost,boolean noisecancelation ){
		System.out.println("Invoking constructor");
		System.out.println(colour+"\t"+cost+"rs\t"+noisecancelation);
	}
	
	
	
	
}