class Scooter{
	int cost=10000;
	String company="TVS";
	String  fuelType="petrol";
	int cc=110;
	String scootername="Tvs Jupiter";
	String airFilterType;
	float fuelTankCapactiy=6.5f;
	boolean chargerport=false;
	String wheelType="Tube";
	Scooter(){
		System.out.println("noarg constructor");
		
	}
	Scooter(int cost){
		System.out.println("cost:"+this.cost);
		this.cost=cost;
		System.out.println("thisCost:"+this.cost+"cost:"+cost);
		
	}
	Scooter(int cc,String fuelType){
		System.out.println("CC:"+this.cc);
		this.cc=cc;
		System.out.println("CC:"+cc);
		this.fuelType=fuelType;
		System.out.println("FuelType:"+this.fuelType+"\nFuelType:"+fuelType);
		
	}
	Scooter(String company,String scootername){
	this.company=company;
		this.scootername=scootername;
		System.out.println("Company:"+company+"\tScootername:"+scootername);
		
	}
	Scooter(float fuelTankCapactiy,String airFilterType,boolean chargerport){
		System.out.println(this. airFilterType);
		this .fuelTankCapactiy=fuelTankCapactiy;
		this.airFilterType=airFilterType;
		this.chargerport=chargerport;
		System.out.println(fuelTankCapactiy+airFilterType+chargerport);
		
	}
	Scooter(String wheelType){
		System.out.println("thiswheel:"+this.wheelType+"\twheelType:"+wheelType);
		this.wheelType=wheelType;
		System.out.println("thiswheel:"+this.wheelType+"\twheelType:"+wheelType);
	}
	
	
}