package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Hourly_Employee_2")
public class HourlyEmployee extends Employee {
	
	private int maxHoursPerDay;
	private double hourlyRate;
	
@Column(name="max_hour_per_rate")	
	public int getMaxHoursPerDay() {
		return maxHoursPerDay;
	}
	public void setMaxHoursPerDay(int maxHoursPerDay) {
		this.maxHoursPerDay = maxHoursPerDay;
	}
@Column(name ="hourly_rate")
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

}
