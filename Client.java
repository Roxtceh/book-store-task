import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Client extends User{
	public Client() {
	}

	public Client(BigDecimal balance) {
		super();
		this.balance = balance;
	}



	BigDecimal balance;
	List<Order> orders;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(balance);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(balance, other.balance);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", email=" + email + ", password=" + password + ", name="
				+ name +" balance=" + balance+"]";
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
