/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

public class SolidStateDrive extends Storage{
	private String name;
	private double price;
	private int storageSize;
	private int bandwith;
	public SolidStateDrive(String name, double price, int storageSize, int bandwith) {
		this.name = name;
		this.price = price;
		this.storageSize = storageSize;
		this.bandwith = bandwith;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStoragesize() {
		return storageSize;
	}
	
	public int getBandwith() {
		return bandwith;
	}
}
