package com.example.demo.beans;

public class ComputerClass {

	public String modelName;
	public String brandName;
	public OperatingSystem operatingSystem;
	
	public ComputerClass(String modelName, String brandName, String osName) {

		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = new OperatingSystem(osName);
	}

	public class OperatingSystem {

		String osName;

		public OperatingSystem(String osName) {
			super();
			this.osName = osName;
		}

		public void display() {

			System.out.println("Os Name : " + osName);
		}

	}

	public static class USB {

		private String usbType;

		public USB(String usbType) {

			this.usbType = usbType;
		}

		public void display() {

			System.out.println("USB Type : " + usbType);
		}
	}

}
