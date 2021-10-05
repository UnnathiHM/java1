class IronBoxRunner{
	public static void main(String[] values){
		System.out.println("Call by Value and Call by refernces concept");
		String type="silk";
		IronBox.heating(type);
		IronBox.heating("cotton");
		boolean yes=true;
		IronBox.StreamWater(yes);
		
	}
	
}