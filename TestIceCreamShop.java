
public class TestIceCreamShop {

	public static void main(String[] args) {

		//create a shop
		IceCreamShop flavor31 = new IceCreamShop();
		
		//state of the ice cream
		flavor31.setName("Flavor 31");
		flavor31.setAddress("123 Main St, Seattle WA");

		String[] flvr = {"Toffee", "Chocolate", "Cookie Dough"};
		String[] cont = {"Waffle Cones", "Cups"};
		
		flavor31.setFlavors(flvr);
		flavor31.setContainers(cont);
		
		System.out.println(flavor31.getDescription());
		

		
		/*
		favoritePlace.setName("Friends Cafe");
		favoritePlace.setAddress("500 W 2nd Ave");
		favoritePlace.setRating(5);
		System.out.println(favoritePlace.getDescription()); */
	}
}
