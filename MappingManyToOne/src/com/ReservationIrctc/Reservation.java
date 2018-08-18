package com.ReservationIrctc;

public class Reservation {
	private Integer reservationId;
	private String passengerName;
	private String berth;
	private String date;
	private String status;
	private Irctc Object;
	
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Irctc getObject() {
		return Object;
	}
	public void setObject(Irctc object) {
		Object = object;
	}
	
	
}
