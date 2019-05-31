/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

public class Memory {
	private String name;
	private double price;
	private double size;
	private int speed;
	private String type;
	
	public Memory(String name, double price, double size, int speed, String type) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.speed = speed;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getSize() {
		return size;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getType() {
		return type;
	}
}
