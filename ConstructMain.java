class ConstructMain{
	public static void main(String[] arg){
		System.out.println("-------HANDBAG CLASS------");
		new HandBag();
		new HandBag(null);
		new HandBag("latehr");
		String cloth="PU";
		new HandBag(cloth);
		new HandBag(null,null);
		new HandBag(cloth,"BagPAck");
		new HandBag("lather","luagge bag");
		String bagtype="Sling";
		new HandBag(cloth,bagtype);
		new HandBag(cloth,bagtype,true);
		boolean waterProf=false;
		new HandBag(cloth,bagtype,waterProf);
		System.out.println("-------CLIMATE CLASS------");
		new Climate();
		new Climate(null);
		new Climate("South-west");
		String direction="South-east";
		new Climate(direction);
		new Climate(0,0);
		int Humidity=100;
		int WindSpeed=3;
		new Climate(95,2);
		new Climate(Humidity,2);
		new Climate(Humidity,WindSpeed);
		 boolean raining=true;
		 int speed=4;
		new Climate(direction,raining,speed);
		new Climate(direction,false,speed);
		new Climate("North",true,5);
	System.out.println("-------HEADSET CLASS------");
	new HeadSet();
	new HeadSet(null);
	new HeadSet("boat");
	String company="JBL";
	new HeadSet(company);
	new HeadSet(null,0);
	new HeadSet("red",23435);
	String colour="black";
	int cost=76669;	
	new HeadSet(colour,cost);
	new HeadSet(null,0,true);
	boolean noisecancelation=false;
	new HeadSet(colour,cost,noisecancelation);
	new HeadSet("white",64738,true);
	}
}