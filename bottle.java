class bottle{
	public static void storing(int price,String color,int height,String quality,String[] brands){
		System.out.println("Price:"+price);
		System.out.println("Color:"+color);
		System.out.println("height:"+height);
		System.out.println("Quality:"+quality);
		for(int i=0;i<brands.length;i++){
			System.out.println(brands[i]);
		}
	}
}