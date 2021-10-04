class Movie{
	public static void entertain(int ticketprice,int lenght,String movieName,int rating ,String[] actors){
		System.out.println("Ticket-Price:"+ticketprice+"rs");
		System.out.println("Movie-Length:"+lenght+"hr");
		System.out.println("Movie-Name:"+movieName);
		System.out.println("Movie-rating:"+rating+"/5");
		System.out.println("Movie-casting:");
		for(int i=0;i<actors.length;i++){
			System.out.println(actors[i]);
		}
	}
}