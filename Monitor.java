class Monitor{
		int price=108999;
		String company;
		int width=13;;
		String type;
		int noOfPort=5;
		String interfacers="VGA";
		String connectionType="non-wierd";
		boolean curved=false;
		Monitor(){
		System.out.println("no-argument constructor");
		}
		Monitor(int price){
			System.out.println(price);
			this.price=price;
			System.out.println(price);
		}
		Monitor(String company,String type){
			this.company=company;
			this.type=type;
			System.out.println("company:"+company+"\tType:"+type);
		}
		Monitor(int width, int noOfPort){
			System.out.println(width);
			System.out.println(this.width);
			this.width=width;
			this.noOfPort=noOfPort;
			System.out.println("Width:"+width);
			System.out.println("NoOfPorts:"+noOfPort);
		}
			Monitor(String interfacers, String connectionType,boolean curved){
				System.out.println("thisInterface:"+this.interfacers);
				this .interfacers=interfacers;
				this.connectionType=connectionType;
				this.curved=curved;
				System.out.println("thisInterface:"+this.interfacers+"\tInterface:"+interfacers);
				System.out.println("thisconnectionType:"+this.connectionType+"\tConnectionTpye:"+connectionType);
				System.out.println("thiscurved:"+this.curved+"\tCurved:"+curved);
			}
			
}