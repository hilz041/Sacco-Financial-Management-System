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
@Table(name ="CLIENTSAVINGS")
public class ClientSavings implements Serializable{

	public ClientSavings(int id, String name, String transaction_type, int client_savings_id, double deposit_amount,
			double withdraw_amount, double total_account_balance, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.transaction_type = transaction_type;
		this.client_savings_id = client_savings_id;
		this.deposit_amount = deposit_amount;
		this.withdraw_amount = withdraw_amount;
		this.total_account_balance = total_account_balance;
		this.date = date;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1955756028316688341L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TRANSACTION_TYPE")
	private String transaction_type;
	
	@Column(name = "CLIENT_SAVINGS_ID")
	private int client_savings_id;
	
	@Column(name = "DEPOSIT_AMOUNT")
	private double deposit_amount;
	
	@Column(name = "WITHDRAW_AMOUNT")
	private double withdraw_amount;
	
	@Column(name = "TOTAL_ACCOUNT_BALANCE")
	private double total_account_balance;
	
	@Column(name = "DATE")
	private Date date;
	
	public ClientSavings() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTransaction_type() {
		return transaction_type;
	}


	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}


	public int getClient_savings_id() {
		return client_savings_id;
	}


	public void setClient_savings_id(int client_savings_id) {
		this.client_savings_id = client_savings_id;
	}


	public double getDeposit_amount() {
		return deposit_amount;
	}


	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}


	public double getWithdraw_amount() {
		return withdraw_amount;
	}


	public void setWithdraw_amount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}


	public double getTotal_account_balance() {
		return total_account_balance;
	}


	public void setTotal_account_balance(double total_account_balance) {
		this.total_account_balance = total_account_balance;
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
		result = prime * result + client_savings_id;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(deposit_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(total_account_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transaction_type == null) ? 0 : transaction_type.hashCode());
		temp = Double.doubleToLongBits(withdraw_amount);
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
		ClientSavings other = (ClientSavings) obj;
		if (client_savings_id != other.client_savings_id)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(deposit_amount) != Double.doubleToLongBits(other.deposit_amount))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(total_account_balance) != Double.doubleToLongBits(other.total_account_balance))
			return false;
		if (transaction_type == null) {
			if (other.transaction_type != null)
				return false;
		} else if (!transaction_type.equals(other.transaction_type))
			return false;
		if (Double.doubleToLongBits(withdraw_amount) != Double.doubleToLongBits(other.withdraw_amount))
			return false;
		return true;
	}

}
