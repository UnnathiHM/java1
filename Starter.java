class Starter{
	public static void main(String[] args){
	Bicycle bicycle=new Bicycle("black",74488,"atlas",type.city);
	bicycle.move();
	bicycle.brake();
	bicycle.displayDetails();
	
	
	Lock lock=new Lock();
	lock.open();
	lock.close();
	
	Watch watch=new Watch("india",Types.Analog);
	watch.displayDetails();
	watch.countryMade="china";
	System.out.println(watch.countryMade);
	}
}