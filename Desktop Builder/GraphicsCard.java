/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

public class GraphicsCard {
	private String name;
	private double price;
	private int coreCount;
	private int clockSpeed;
	private double memorySize;
	private int memorySpeed;
	private String memoryType;
	private String busVersion;
	
	public GraphicsCard(String name, double price, int coreCount, int clockSpeed, int memorySize, int memorySpeed, String memoryType, String busVersion) {
		this.name = name;
		this.price = price;
		this.coreCount = coreCount;
		this.clockSpeed = clockSpeed;
		this.memorySize = memorySize;
		this.memorySpeed = memorySpeed;
		this.memoryType = memoryType;
		this.busVersion = busVersion;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCoreCount() {
		return coreCount;
	}
	
	public int getClockSpeed() {
		return clockSpeed;
	}
	
	public double getMemorySize() {
		return memorySize;
	}
	
	public int getMemorySpeed() {
		return memorySpeed;
	}
	
	public String getMemoryType() {
		return memoryType;
	}
	
	public String getBusVersion() {
		return busVersion;
	}
}
