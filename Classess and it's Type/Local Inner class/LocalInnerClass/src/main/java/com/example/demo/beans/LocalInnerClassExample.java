package com.example.demo.beans;

import org.apache.logging.log4j.util.Strings;

public class LocalInnerClassExample {

	private String name;
	private int totalRoom;
	private int reservedRooms;

	public LocalInnerClassExample(String name, int totalRoom, int reservedRooms) {
		super();
		this.name = name;
		this.totalRoom = totalRoom;
		this.reservedRooms = reservedRooms;
	}

	public void reserverRoom(String guestName, int rooms) {

		class Reservationvalidator {

			boolean validate() {

				if (Strings.isBlank(guestName) || Strings.isEmpty(guestName)) {

					System.out.println("Please provide a valid Customer name");

					return false;
				}

				int availableRooms = totalRoom - reservedRooms;

				if (totalRoom < reservedRooms) {

					System.out.println("Sorry All Rooms Are Reserved");

					return false;
				}

				if (availableRooms < rooms) {
					
					System.out.println("Sorry We have available rooms : " + availableRooms);

					return false;
				}

				System.out.println(String.format("Hello %s, Your Room Seuccessfully booked", name));
				return true;
			}

		}

		Reservationvalidator reservationvalidator = new Reservationvalidator();
		reservationvalidator.validate();

	}

}
