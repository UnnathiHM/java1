class  BottleRunner{
	public static void main(String[] arg){
		int price,height;
		String qualitiy="good",color="green";
		String[] brands={"cello","tupperwear","perstige","puma"};
		Bottle.storing(200,qualitiy,15,color,brands);
		System.out.println("-----------------");
		Bottle.storing(500,"Average",20,"red",brands);
		
		
	}
}
