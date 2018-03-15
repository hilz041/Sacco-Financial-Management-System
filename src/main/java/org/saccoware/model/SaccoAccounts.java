package org.saccoware.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="SACCOACCOUNTS")
public class SaccoAccounts implements Serializable{

	public SaccoAccounts(int id, double total_value_of_savings, double actual_value_of_savings, double total_ariers,
			int number_of_borrowers, double total_loan_disbursed, double total_loan_paid, Date date) {
		super();
		this.id = id;
		this.total_value_of_savings = total_value_of_savings;
		this.actual_value_of_savings = actual_value_of_savings;
		this.total_ariers = total_ariers;
		this.number_of_borrowers = number_of_borrowers;
		this.total_loan_disbursed = total_loan_disbursed;
		this.total_loan_paid = total_loan_paid;
		this.date = date;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = -8355800242019142947L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	@Column(name = "TOTAL_VALUE_OF_SAVINGS")
	private double total_value_of_savings;
	
	@Column(name = "ACTUAL_VALUE_OF_SAVINGS")
	private double actual_value_of_savings;
	
	
	@Column(name = "TOTAL_ARIERS")
	private double total_ariers;
	
	
	@Column(name = "NUMBER_OF_BORROWERS")
	private int number_of_borrowers;
	
	
	@Column(name = "TOTAL_LOAN_DISBURSED")
	private double total_loan_disbursed;
	
	@Column(name = "TOTAL_LOAN_PAID")
	private double total_loan_paid;
	
	
	
	@Column(name = "DATE")
	private Date date;


	public SaccoAccounts() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getTotal_value_of_savings() {
		return total_value_of_savings;
	}


	public void setTotal_value_of_savings(double total_value_of_savings) {
		this.total_value_of_savings = total_value_of_savings;
	}


	public double getActual_value_of_savings() {
		return actual_value_of_savings;
	}


	public void setActual_value_of_savings(double actual_value_of_savings) {
		this.actual_value_of_savings = actual_value_of_savings;
	}


	public double getTotal_ariers() {
		return total_ariers;
	}


	public void setTotal_ariers(double total_ariers) {
		this.total_ariers = total_ariers;
	}


	public int getNumber_of_borrowers() {
		return number_of_borrowers;
	}


	public void setNumber_of_borrowers(int number_of_borrowers) {
		this.number_of_borrowers = number_of_borrowers;
	}


	public double getTotal_loan_disbursed() {
		return total_loan_disbursed;
	}


	public void setTotal_loan_disbursed(double total_loan_disbursed) {
		this.total_loan_disbursed = total_loan_disbursed;
	}


	public double getTotal_loan_paid() {
		return total_loan_paid;
	}


	public void setTotal_loan_paid(double total_loan_paid) {
		this.total_loan_paid = total_loan_paid;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(actual_value_of_savings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + number_of_borrowers;
		temp = Double.doubleToLongBits(total_ariers);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total_loan_disbursed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total_loan_paid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total_value_of_savings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaccoAccounts other = (SaccoAccounts) obj;
		if (Double.doubleToLongBits(actual_value_of_savings) != Double.doubleToLongBits(other.actual_value_of_savings))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (number_of_borrowers != other.number_of_borrowers)
			return false;
		if (Double.doubleToLongBits(total_ariers) != Double.doubleToLongBits(other.total_ariers))
			return false;
		if (Double.doubleToLongBits(total_loan_disbursed) != Double.doubleToLongBits(other.total_loan_disbursed))
			return false;
		if (Double.doubleToLongBits(total_loan_paid) != Double.doubleToLongBits(other.total_loan_paid))
			return false;
		if (Double.doubleToLongBits(total_value_of_savings) != Double.doubleToLongBits(other.total_value_of_savings))
			return false;
		return true;
	}

}
