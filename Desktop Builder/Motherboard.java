/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

public class Motherboard extends Main{
	private String name;
	private double price;
	private String socketType;
	private String busVersion;
	private String memoryType;
	
	public Motherboard(String name, double price, String socketType, String busVersion, String memoryType) {
		this.name = name;
		this.price = price;
		this.socketType = socketType;
		this.busVersion = busVersion;
		this.memoryType = memoryType;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getSocketType() {
		return socketType;
	}
	
	public String getBusVersion() {
		return busVersion;
	}
	
	public String getMemoryType() {
		return memoryType;
	}
}
