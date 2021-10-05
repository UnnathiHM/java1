class Runner1{
public static void main(String[] a){
	Transformer trans=new Transformer();
	Robot robo=new Robot();
	Water water=new Water();
	System.out.println("x value="+water.x);
	Motor M=new Motor(10,20);
	HardDisk hd=new HardDisk(30);
	Internet internet=new Internet();
	String provider="IDEA";
	System.out.println(provider);
	String pro=internet.provider;
	System.out.println(pro);
	Deodrant deo=new Deodrant();
	String band=deo.brand;
	int rs=deo.price;
	String Quality=deo.quality;
	String colour=deo.color;
	System.out.println(band+","+rs+","+Quality+","+colour);
	PowerBank PB=new PowerBank();
	System.out.println(PB);	
	Wallet wallet=new Wallet();
	int RS=wallet.price;
	String Colour=wallet.color;
	String country=wallet.countryMade;
	System.out.println(RS+","+Colour+","+country);
}


}