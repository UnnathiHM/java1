class Climate{
	int temp=22;
	int humidity;
	String Loaction="chikamagaluru";
	String windDirection;
	int windSpeed;
	Climate(){
		System.out.println("default constructor for cliamte");
	}
	Climate(String winddirection){
		System.out.println("Invoking constructor");
		windDirection=winddirection;
		System.out.println(windDirection);
	}
	Climate(int Humidity,int WindSpeed ){
		System.out.println("Invoking constructogr");
	     humidity=Humidity;
		 windSpeed=WindSpeed;
		System.out.println(humidity+"%\t"+windSpeed+"km/hr");
	}
	Climate(String direction,boolean Raining ,int speed){
		System.out.println("Invoking constructor");
		System.out.println(direction+"\t"+speed+"\t"+Raining);
	}
}