class Bicycle{
String color="red";
int price=10;
String company="Atlas";
type btype=type.hybrid;
Bicycle(String color,int  price,String company, type btype)
{
     System.out.println("Invoking all arguments");
	 this.color=color;
	 this.price=price;
	 this.company=company;
	 this.btype=btype;
}


 void brake(){
	System.out.println("break method");
}
void move(){
	System.out.println("move method");
}
void displayDetails(){
	System.out.println("color:"+color);
	System.out.println("price:"+price);
	System.out.println("company:"+company);
	System.out.println(type.hybrid);
	
}


}