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
@Table(name ="CLIENTLOAN")
public class ClientLoan implements Serializable{

	public ClientLoan(int id, String borrower_name, double amount_borrowed, int interest, Date repayment_date,
			double value_of_loan_in_ariers, Date date) {
		super();
		this.id = id;
		this.borrower_name = borrower_name;
		this.amount_borrowed = amount_borrowed;
		this.interest = interest;
		this.repayment_date = repayment_date;
		this.value_of_loan_in_ariers = value_of_loan_in_ariers;
		this.date = date;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8416631028467565626L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	@Column(name = "BORROWER_NAME")
	private String borrower_name;
	
	
	@Column(name = "AMOUNT_BORROWED")
	private double amount_borrowed;
	
	@Column(name = "INTEREST")
	private int interest;
	
	@Column(name = "REPAYMENT_DATE ")
	private Date repayment_date;
	
	@Column(name = "VALUE_OF_LOAN_IN_ARIERS")
	private double value_of_loan_in_ariers;
	
	@Column(name = "DATE")
	private Date date;

	public ClientLoan() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount_borrowed() {
		return amount_borrowed;
	}

	public void setAmount_borrowed(double amount_borrowed) {
		this.amount_borrowed = amount_borrowed;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public Date getRepayment_date() {
		return repayment_date;
	}

	public void setRepayment_date(Date repayment_date) {
		this.repayment_date = repayment_date;
	}

	public double getValue_of_loan_in_ariers() {
		return value_of_loan_in_ariers;
	}

	public void setValue_of_loan_in_ariers(double value_of_loan_in_ariers) {
		this.value_of_loan_in_ariers = value_of_loan_in_ariers;
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
		temp = Double.doubleToLongBits(amount_borrowed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((borrower_name == null) ? 0 : borrower_name.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + interest;
		result = prime * result + ((repayment_date == null) ? 0 : repayment_date.hashCode());
		temp = Double.doubleToLongBits(value_of_loan_in_ariers);
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
		ClientLoan other = (ClientLoan) obj;
		if (Double.doubleToLongBits(amount_borrowed) != Double.doubleToLongBits(other.amount_borrowed))
			return false;
		if (borrower_name == null) {
			if (other.borrower_name != null)
				return false;
		} else if (!borrower_name.equals(other.borrower_name))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (interest != other.interest)
			return false;
		if (repayment_date == null) {
			if (other.repayment_date != null)
				return false;
		} else if (!repayment_date.equals(other.repayment_date))
			return false;
		if (Double.doubleToLongBits(value_of_loan_in_ariers) != Double.doubleToLongBits(other.value_of_loan_in_ariers))
			return false;
		return true;
	}

	public String getBorrower_name() {
		return borrower_name;
	}

	public void setBorrower_name(String borrower_name) {
		this.borrower_name = borrower_name;
	}

}
