class HandBag{
	String color="pink";
	int price=5368;
	String brand="H&M";
	int size=23;
	String material;
	String typeOfBag;
	HandBag(){
		System.out.println("default constructor");
	}
	HandBag(String cloth){
		System.out.println("Invoking constructor");
		material=cloth;
		System.out.println(material);
	}
	HandBag(String cloth,String type ){
		System.out.println("Invoking constructor");
		material=cloth;
		typeOfBag=type;
		System.out.println(material+"\t"+type);
	}
	HandBag(String cloth,String type,boolean waterProf ){
		System.out.println("Invoking constructor");
		material=cloth;
		typeOfBag=type;
		System.out.println(material+"\t"+type+"\t"+waterProf);
	}
	
	
}