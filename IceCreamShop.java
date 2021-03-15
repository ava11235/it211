import java.util.Arrays;

public class IceCreamShop extends Business {
	
	private String[] flavors;
	private String[] containers;
	
		
	
	   public String[] getFlavors() {
		return flavors;
	}



	public void setFlavors(String[] flavors) {
		this.flavors = flavors;
	}



	public String[] getContainers() {
		return containers;
	}



	public void setContainers(String[] containers) {
		this.containers = containers;
	}


	@Override
	   public String getDescription() {
	      return super.getDescription() + " " +  Arrays.toString(this.getFlavors()) + " " + Arrays.toString(this.getContainers()); 
	   }
	}

