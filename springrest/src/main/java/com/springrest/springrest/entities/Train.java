package com.springrest.springrest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
    private long UserId;
    private double PNR_No ;
    private double Train_No;
    private String UserName;
    private String Class_bogi;
    private int Seat_No;
    
    
	public Train(long userId, double pNR_No, double train_No, String userName, String class_bogi, int seat_No) {
		super();
		UserId = userId;
		PNR_No = pNR_No;
		Train_No = train_No;
		UserName = userName;
		Class_bogi = class_bogi;
		Seat_No = seat_No;
	}


	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getUserId() {
		return UserId;
	}


	public void setUserId(long userId) {
		UserId = userId;
	}


	public double getPNR_No() {
		return PNR_No;
	}


	public void setPNR_No(double pNR_No) {
		PNR_No = pNR_No;
	}


	public double getTrain_No() {
		return Train_No;
	}


	public void setTrain_No(double train_No) {
		Train_No = train_No;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getClass_bogi() {
		return Class_bogi;
	}


	public void setClass_bogi(String class_bogi) {
		Class_bogi = class_bogi;
	}


	public int getSeat_No() {
		return Seat_No;
	}


	public void setSeat_No(int seat_No) {
		Seat_No = seat_No;
	}


	@Override
	public String toString() {
		return "Course [UserId=" + UserId + ", PNR_No=" + PNR_No + ", Train_No=" + Train_No + ", UserName=" + UserName
				+ ", Class_bogi=" + Class_bogi + ", Seat_No=" + Seat_No + "]";
	}
    
    
    
	
}
