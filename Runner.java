class Runner{
public static void main(String[] arg){
	Fish fish=new Fish();
	fish.name="crab";
	System.out.println(fish.name+","+fish.price+","+fish.kilo);
	Train train=new Train();
	train.price=324;
	train.timing="12hr";
	System.out.println(train.price);
	System.out.println(train.timing);
	Charger charger=new Charger();
	charger.length=12.3f;
	charger.type="USB";
	System.out.println(charger.type+"\n"+charger.length);
	
	
}
}