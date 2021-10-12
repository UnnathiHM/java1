class MainClass{
		public static void main(String[] args){
			new Monitor();
			new Monitor(24);
			new Monitor("Sony","LED");
			new Monitor(1323,4);
		Monitor monitor=new Monitor("HDMI","wired",true);
		System.out.println(monitor);
		System.out.println(monitor.interfacers);
			new Scooter();
			new Scooter(322424);
			new Scooter(120,"electric");
			new Scooter("honda","honda dio");
			Scooter  scooter=new Scooter(6.2f, "paper air filetr",true);
			new Scooter("tubeless");
		}
}