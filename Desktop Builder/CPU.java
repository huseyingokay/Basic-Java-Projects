/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

public class CPU {
	private String name;
	private double price;
	private int coreCount;
	private int clockSpeed;
	private String socketType;
	
	public CPU(String name, double price, int coreCount, int clockSpeed, String socketType) {
		this.name = name;
		this.price = price;
		this.coreCount = coreCount;
		this.clockSpeed = clockSpeed;
		this.socketType = socketType;
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
	
	public String getSocketType() {
		return socketType;
	}
}
//for(int i = 0; i < motherboards.length; i++) {
//final int a = i;
//motherboards[i] = new JButton(motherboardList.get(i).toString());
//motherboards[i].addActionListener(new ActionListener() {
//	  public void actionPerformed(ActionEvent e) {
//		  if(motherboard!=null) {
//			  totalPrice -= motherboard.getPrice();
//		  }
//		  motherboard = motherboardList.get(a);
//		  totalPrice += motherboard.getPrice();
//		  price.setText("Price: " + totalPrice + " TL");
//		  chosenMotherboard.setText(motherboard.toString());
//		  motherboardScreen.setVisible(false);
//		  buildScreen.setVisible(true);
//		  frame.add(buildScreen);
//		  frame.remove(motherboardScreen);
//		  motherboardScreen.validate();
//		  frame.validate();
//	  }
//	});
//motherboardMenu.add(motherboards[i]);
//}