package Mar;

public class Animal {

	private String name;
private 	String type;


	Animal(String name,String type)
	{
		name=name;
		this.type=type;
		switch (type) {
		case "White":
			System.out.println("color is white");
			break;

		case "Black":
			System.out.println("color is Black");
break;
		default:
			System.out.println("color is unknown");
					}
		
	}
	public static void main(String[] args) {
		Animal a=new Animal("Dog","White");
		System.out.println(a.name);
		System.out.println(a.type);
		
		
		
}
	

}
