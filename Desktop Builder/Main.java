/* Hüseyin GÖKAY
 * S018160
 * Department of Computer Science
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Main {
	private static int price = 0;
	private static Motherboard smBoard;
	private static CPU scpu;
	private static Memory smemory;
	private static GraphicsCard sgpu;
	private static Storage sstorage;
	private static Scanner components;
	public static void main(String[] args) throws FileNotFoundException {
		File componentsList = new File(getFileName());
		components = new Scanner(componentsList);
		
		//arrays
				ArrayList<Motherboard> motherboards=new ArrayList<Motherboard>();
				ArrayList<CPU> cpus=new ArrayList<CPU>();
				ArrayList<Memory> memories=new ArrayList<Memory>();
				ArrayList<GraphicsCard> gpus=new ArrayList<GraphicsCard>();
				ArrayList<Storage> storages=new ArrayList<Storage>();
		
				
		//Adjusting Frame
				JFrame mainFrame = new JFrame();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setSize(700,400);
				mainFrame.setLayout(new BorderLayout());
				mainFrame.setBackground(new Color(128,128,128));
		
		
		//Adjusting mainPanel
				JPanel mainPanel = new JPanel();
				mainPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
				mainPanel.setLayout(new GridLayout(5,0));
				mainPanel.setPreferredSize(new Dimension(700,200));
				
				
		//Panels of mainPanel
				JPanel inPanel1 = new JPanel();
				inPanel1.setLayout(new BorderLayout());
				
				JPanel inPanel2 = new JPanel();
				inPanel2.setLayout(new BorderLayout());
				
				JPanel inPanel3 = new JPanel();
				inPanel3.setLayout(new BorderLayout());
				
				JPanel inPanel4 = new JPanel();
				inPanel4.setLayout(new BorderLayout());
				
				JPanel inPanel5 = new JPanel();
				inPanel5.setLayout(new BorderLayout());
				
		//lowerPanel
				JPanel lowerPanel = new JPanel(new FlowLayout());
				lowerPanel.setBackground(new Color(128,128,128));
				lowerPanel.setPreferredSize(new Dimension(700,45));
				
		//upperPanels
				JPanel upperPanel1 = new JPanel();
				upperPanel1.setLayout(new FlowLayout());
				upperPanel1.add(new JLabel("MotherBoard"));
				upperPanel1.setBackground(new Color(121,127,107));
				upperPanel1.setVisible(false);
				
				JPanel upperPanel2 = new JPanel();
				upperPanel2.setLayout(new FlowLayout());
				upperPanel2.add(new JLabel("CPU"));
				upperPanel2.setBackground(new Color(121,127,107));
				upperPanel2.setVisible(false);
				
				JPanel upperPanel3 = new JPanel();
				upperPanel3.setLayout(new FlowLayout());
				upperPanel3.add(new JLabel("Memory"));
				upperPanel3.setBackground(new Color(121,127,107));
				upperPanel3.setVisible(false);
				
				JPanel upperPanel4 = new JPanel();
				upperPanel4.setLayout(new FlowLayout());
				upperPanel4.add(new JLabel("GPU"));
				upperPanel4.setBackground(new Color(121,127,107));
				upperPanel4.setVisible(false);
				
				JPanel upperPanel5 = new JPanel();
				upperPanel5.setLayout(new FlowLayout());
				upperPanel5.add(new JLabel("Storage"));
				upperPanel5.setBackground(new Color(121,127,107));
				mainFrame.add(upperPanel5,BorderLayout.NORTH);
				upperPanel5.setVisible(false);
				
				mainFrame.validate();
				upperPanel1.validate();
		
		//Textfields(motherboard,cpu...)
				//motherboard
				JLabel motherboard = new JLabel("Motherboard");
				motherboard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				motherboard.setBackground(new Color(255,255,255));
				motherboard.setOpaque(true);
				inPanel1.add(motherboard);
				
				//cpu
				JLabel cpu = new JLabel("CPU");
				cpu.setBackground(new Color(255,255,255));
				cpu.setOpaque(true);
				cpu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				inPanel2.add(cpu);
			
				//memory
				JLabel memory = new JLabel("Memory");		
				memory.setBackground(new Color(255,255,255));
				memory.setOpaque(true);
				memory.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				inPanel3.add(memory);
				
				//gpu
				JLabel gpu = new JLabel("Graphics Card");
				gpu.setBackground(new Color(255,255,255));
				gpu.setOpaque(true);
				gpu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				inPanel4.add(gpu);
				
				//storage
				JLabel storage = new JLabel("Storage");
				storage.setBackground(new Color(255,255,255));
				storage.setOpaque(true);
				storage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				inPanel5.add(storage);
		
				
		//creating objects 
				while(components.hasNextLine()) {
					String type = components.nextLine();
					if(type.equals("Type:Motherboard")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						String socketType = components.nextLine().substring(11);
						String memoryType = components.nextLine().substring(11);
						String busVersion = components.nextLine().substring(11);
						motherboards.add(new Motherboard(name, price, socketType, busVersion, memoryType));
					}
					
					if(type.equals("Type:CPU")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						int coreCount = Integer.parseInt(components.nextLine().substring(10));
						int clockSpeed = Integer.parseInt(components.nextLine().substring(11));
						String socketType = components.nextLine().substring(11);
						cpus.add(new CPU(name, price, coreCount, clockSpeed,socketType));
					}
					
					if(type.equals("Type:Memory")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						int memorySize = Integer.parseInt(components.nextLine().substring(11));
						int memorySpeed = Integer.parseInt(components.nextLine().substring(12));
						String memoryType = components.nextLine().substring(11);
						memories.add(new Memory(name, price, memorySize, memorySpeed, memoryType));
					}
					
					if(type.equals("Type:GraphicsCard")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						int coreCount = Integer.parseInt(components.nextLine().substring(10));
						int clockSpeed = Integer.parseInt(components.nextLine().substring(11));
						int memorySize = Integer.parseInt(components.nextLine().substring(11));
						int memorySpeed = Integer.parseInt(components.nextLine().substring(12));
						String memoryType = components.nextLine().substring(11);
						String busVersion = components.nextLine().substring(11);
						gpus.add(new GraphicsCard(name, price,coreCount, clockSpeed, memorySize, memorySpeed, memoryType, busVersion));
					}
					
					if(type.equals("Type:HardDiskDrive")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						int storageSize = Integer.parseInt(components.nextLine().substring(12));
						int bandwith = Integer.parseInt(components.nextLine().substring(9));
						storages.add(new HardDiskDrive(name, price, storageSize, bandwith));
					}
					
					if(type.equals("Type:SolidStateDrive")) {
						String name = components.nextLine().substring(5);
						double price = Double.parseDouble(components.nextLine().substring(6));
						int storageSize = Integer.parseInt(components.nextLine().substring(12));
						int bandwith = Integer.parseInt(components.nextLine().substring(9));
						storages.add(new SolidStateDrive(name, price, storageSize, bandwith));
					}
				}
					
				JLabel pricep = new JLabel("Price: "+price+" TL");
		
		//side panels
				JPanel motherboardScreen = new JPanel();
				motherboardScreen.setLayout(new FlowLayout(FlowLayout.CENTER,9999,motherboards.size()));
				
				for(int i=0; i<motherboards.size(); i++) {
					motherboardScreen.add(new JButton(motherboards.get(i).getName()+"   "+ motherboards.get(i).getMemoryType()+"   "+motherboards.get(i).getBusVersion()+"   "+ motherboards.get(i).getSocketType() +"   Price: "+motherboards.get(i).getPrice()+" TL"));
				}	
					
				for(int k=0; k<motherboards.size(); k++) {
					int b = k;
					Component[] comp = motherboardScreen.getComponents();
					((JButton)comp[b]).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent arg0) {
							upperPanel1.setVisible(false);
							int i = b;
							if(smBoard!=null) {
								price -=smBoard.getPrice();
								price+=motherboards.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}else {
								price+=motherboards.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}
							smBoard = motherboards.get(i);
							motherboardScreen.setVisible(false);
							mainPanel.setVisible(true);
							motherboard.setText("Motherboard: "+motherboards.get(i).getName()+"   "+ motherboards.get(i).getMemoryType()+"   "+motherboards.get(i).getBusVersion()+"   "+ motherboards.get(i).getSocketType() +"   Price: "+motherboards.get(i).getPrice()+" TL");
							inPanel1.add(new JLabel());
						}					
					});				
				}
				JPanel cpuScreen = new JPanel();
				cpuScreen.setLayout(new FlowLayout(FlowLayout.CENTER,9999,cpus.size()));
				for(int i=0; i<cpus.size(); i++) {
					cpuScreen.add(new JButton(cpus.get(i).getName()+"   "+cpus.get(i).getCoreCount()+ " Core   "+cpus.get(i).getClockSpeed()+"Mhz   "+cpus.get(i).getSocketType()+"   Price: "+cpus.get(i).getPrice()+" TL"));
				}
				for(int l=0; l<cpus.size(); l++) {
					int b = l;
					Component[] comp = cpuScreen.getComponents();
					((JButton)comp[b]).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent arg0) {
							upperPanel2.setVisible(false);
							int i = b;
							if(scpu!=null) {
								price -=scpu.getPrice();
								price+=cpus.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}else {
								price+=cpus.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}
							scpu = cpus.get(i);
							cpuScreen.setVisible(false);
							mainPanel.setVisible(true);
							cpu.setText("CPU: "+cpus.get(i).getName()+"   "+cpus.get(i).getCoreCount()+ " Core   "+cpus.get(i).getClockSpeed()+"Mhz   "+cpus.get(i).getSocketType()+"   Price: "+cpus.get(i).getPrice()+" TL");;
						}
					});
				}
				JPanel memoryScreen = new JPanel();
				memoryScreen.setLayout(new FlowLayout(FlowLayout.CENTER,9999,memories.size()));
				for(int i=0; i<memories.size(); i++) {
					memoryScreen.add(new JButton(memories.get(i).getName()+"   "+memories.get(i).getSize() +"GB   "+memories.get(i).getType()+"   "+memories.get(i).getSpeed()+"Mhz   "+"   Price: "+memories.get(i).getPrice()+" TL"));
				}
				for(int m=0; m<memories.size(); m++) {
					int b = m;
					Component[] comp = memoryScreen.getComponents();
					((JButton)comp[b]).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent arg0) {
							upperPanel3.setVisible(false);
							int i = b;
							if(smemory!=null) {
								price -=smemory.getPrice();
								price+=memories.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}else {
								price+=memories.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}
							smemory = memories.get(i);
							memoryScreen.setVisible(false);
							mainPanel.setVisible(true);
							memory.setText("Memory: "+memories.get(i).getName()+"   "+memories.get(i).getSize()+"GB   "+memories.get(i).getType()+"   "+memories.get(i).getSpeed()+"Mhz   "+"   Price: "+memories.get(i).getPrice()+" TL");						
						}
					});
				}
				JPanel gpuScreen = new JPanel();
				gpuScreen.setLayout(new FlowLayout(FlowLayout.CENTER,9999,gpus.size()));
				for(int i=0; i<gpus.size(); i++) {
					gpuScreen.add(new JButton(gpus.get(i).getName()+"   "+gpus.get(i).getCoreCount()+" Core   "+gpus.get(i).getClockSpeed()+"Mhz   "+gpus.get(i).getMemorySize()+"GB   "+gpus.get(i).getMemorySpeed()+"Mhz   "+gpus.get(i).getMemoryType()+"   "+gpus.get(i).getBusVersion()+"   Price: "+gpus.get(i).getPrice()+" TL"));
				}
				for(int n=0; n<gpus.size(); n++) {
					int b = n;
					Component[] comp = gpuScreen.getComponents();
					((JButton)comp[b]).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent arg0) {
							upperPanel4.setVisible(false);
							int i = b;
							if(sgpu!=null) {
								price -= sgpu.getPrice();
								price+=gpus.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}else {
								price+=gpus.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}
							sgpu = gpus.get(i);
							gpuScreen.setVisible(false);
							mainPanel.setVisible(true);
							gpu.setText("GPU: "+gpus.get(i).getName()+"   "+gpus.get(i).getCoreCount()+" Core   "+gpus.get(i).getClockSpeed()+"Mhz   "+gpus.get(i).getMemorySize()+"GB   "+gpus.get(i).getMemorySpeed()+"Mhz   "+gpus.get(i).getMemoryType()+"   "+gpus.get(i).getBusVersion()+"   Price: "+gpus.get(i).getPrice()+" TL");							
						}
					});
				}
				JPanel storageScreen = new JPanel();
				storageScreen.setLayout(new FlowLayout(FlowLayout.CENTER,9999,storages.size()));
				for(int i=0; i<storages.size(); i++) {
					if(storages.get(i) instanceof SolidStateDrive)
						storageScreen.add(new JButton(storages.get(i).getName()+"   SSD   "+storages.get(i).getStoragesize()+"GB   "+storages.get(i).getBandwith()+"MBps    Price: "+storages.get(i).getPrice()+" TL"));
					else
						storageScreen.add(new JButton(storages.get(i).getName()+"   HDD   "+storages.get(i).getStoragesize()+"GB   "+storages.get(i).getBandwith()+"MBps    Price: "+storages.get(i).getPrice()+" TL"));
				}
				for(int j=0; j<storages.size(); j++) {
					int b = j;
					Component[] comp = storageScreen.getComponents();
					((JButton)comp[b]).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent arg0) {
							upperPanel5.setVisible(false);
							int i = b;
							if(sstorage!=null) {
								price -=sstorage.getPrice();
								price+=storages.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}else {
								price+=storages.get(i).getPrice();
								pricep.setText("Price: " +price+ "TL");
							}
							sstorage = storages.get(i);
							storageScreen.setVisible(false);
							mainPanel.setVisible(true);
							if(storages.get(i) instanceof SolidStateDrive)
								storage.setText("Storage: "+storages.get(i).getName()+"   SSD   "+storages.get(i).getStoragesize()+"GB   "+storages.get(i).getBandwith()+"MBps    Price: "+storages.get(i).getPrice()+" TL");	
							else
								storage.setText("Storage: "+storages.get(i).getName()+"   HDD   "+storages.get(i).getStoragesize()+"GB   "+storages.get(i).getBandwith()+"MBps    Price: "+storages.get(i).getPrice()+" TL");
						}
					});
				}

		//buttons
				JButton add1 = new JButton("+");
				add1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						mainFrame.add(motherboardScreen, BorderLayout.CENTER);
						mainFrame.add(upperPanel1,BorderLayout.NORTH);
						upperPanel1.setVisible(true);
						mainPanel.setVisible(false);
						motherboardScreen.setVisible(true);
						motherboardScreen.validate();
						upperPanel1.validate();
					}	
				});
				add1.setLayout(new FlowLayout(FlowLayout.RIGHT));
				inPanel1.add(add1,BorderLayout.EAST);
				
				JButton add2 = new JButton("+");
				add2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						upperPanel2.setVisible(true);
						mainFrame.add(cpuScreen, BorderLayout.CENTER);
						mainFrame.add(upperPanel2,BorderLayout.NORTH);
						mainPanel.setVisible(false);
						cpuScreen.setVisible(true);
						cpuScreen.validate();
					}
				});
				inPanel2.add(add2,BorderLayout.EAST);
				
				JButton add3 = new JButton("+");
				add3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						upperPanel3.setVisible(true);
						mainFrame.add(memoryScreen, BorderLayout.CENTER);
						mainFrame.add(upperPanel3,BorderLayout.NORTH);
						mainPanel.setVisible(false);
						memoryScreen.setVisible(true);
						memoryScreen.validate();
					}
				});
				inPanel3.add(add3,BorderLayout.EAST);
				
				JButton add4 = new JButton("+");
				add4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						upperPanel4.setVisible(true);
						mainFrame.add(gpuScreen, BorderLayout.CENTER);
						mainFrame.add(upperPanel4,BorderLayout.NORTH);
						mainPanel.setVisible(false);
						gpuScreen.setVisible(true);
						gpuScreen.validate();
					}
				});
				inPanel4.add(add4,BorderLayout.EAST);
				
				JButton add5 = new JButton("+");
				add5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						upperPanel5.setVisible(true);
						mainFrame.add(storageScreen, BorderLayout.CENTER);
						mainFrame.add(upperPanel5,BorderLayout.NORTH);
						mainPanel.setVisible(false);
						storageScreen.setVisible(true);
						storageScreen.validate();	
					}
					
				});
				inPanel5.add(add5,BorderLayout.EAST);
		
		
		mainFrame.add(mainPanel,BorderLayout.CENTER);
		
		
		//lowerPanel Components
				//pricep is created above
				pricep.setSize(60,30);
				pricep.validate();
				
				JButton reset = new JButton("Reset");
				reset.validate();
				lowerPanel.validate();

				
				reset.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
					 price = 0;
					 smBoard = null;
					 motherboard.setText("Motherboard");
					 scpu = null;
					 cpu.setText("CPU");
					 smemory = null;
					 memory.setText("Memory");
					 sgpu = null;
					 gpu.setText("GPU");
					 sstorage = null;
					 storage.setText("Storage");
					 
					 pricep.setText("Price:" +price+"TL");	
					 pricep.validate();
					 mainPanel.validate();
					 inPanel1.validate();
					 inPanel2.validate();
					 inPanel3.validate();
					 inPanel4.validate();
					 inPanel5.validate();
					 mainFrame.validate();
					}
				});
		
		reset.setSize(60,30);
		
		JButton bScreen = new JButton("Build Screen");
		bScreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
					upperPanel1.setVisible(false);
					upperPanel2.setVisible(false);
					upperPanel3.setVisible(false);
					upperPanel4.setVisible(false);
					upperPanel5.setVisible(false);
					mainPanel.setVisible(true);
					motherboardScreen.setVisible(false);
					gpuScreen.setVisible(false);
					memoryScreen.setVisible(false);
					cpuScreen.setVisible(false);
					storageScreen.setVisible(false);
					mainPanel.validate();
					mainFrame.validate();
				
			}	
		});
		
		bScreen.setSize(60,30);
		
		JButton cCom = new JButton("Check Compatibility");
		cCom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(smBoard==null||scpu==null||smemory==null||scpu==null||sstorage==null) {
					JOptionPane.showMessageDialog(mainFrame,"Computer is not compatible");
				}
				else if(!smBoard.getSocketType().equals(scpu.getSocketType())) {
					JOptionPane.showMessageDialog(mainFrame,"Computer is not compatible");
				}
				else if(!smBoard.getBusVersion().equals(sgpu.getBusVersion())) {
					JOptionPane.showMessageDialog(mainFrame,"Computer is not compatible");
				}
				else if(!smBoard.getMemoryType().equals(smemory.getType())) {
					JOptionPane.showMessageDialog(mainFrame,"Computer is not compatible");
				}
				else
					JOptionPane.showMessageDialog(mainFrame,"Computer is compatible");
			}
			
		});
		cCom.setSize(60,30);
		
		lowerPanel.add(reset);
		lowerPanel.add(bScreen);
		lowerPanel.add(cCom);
		lowerPanel.add(pricep);
		lowerPanel.validate();
		
		
		//adding panels
		mainFrame.add(mainPanel);
		mainPanel.add(inPanel1);
		mainPanel.add(inPanel2);
		mainPanel.add(inPanel3);
		mainPanel.add(inPanel4);
		mainPanel.add(inPanel5);
		mainFrame.add(lowerPanel,BorderLayout.SOUTH);
		
		mainFrame.setVisible(true);
	}
	
	public static String getFileName(){
		JFileChooser chooser = new JFileChooser() ;
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Txt file" , "txt" ) ;
		chooser.setFileFilter(filter) ;
		int returnVal = chooser.showOpenDialog( null ) ;
		if (returnVal != JFileChooser. APPROVE_OPTION ) {
			throw new RuntimeException( "Failed to choose file" ) ;
		}
		return chooser.getSelectedFile().getAbsolutePath() ;
		}
}
