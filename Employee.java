import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Employee extends User{
	public Employee(){
	}
	
	public Employee(String phone, LocalDate birthDay) {
		super();
		this.phone = phone;
		this.birthDay = birthDay;
	}

	private String phone;
	LocalDate birthDay;
	List<Order> orders;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(birthDay, phone);
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
		Employee other = (Employee) obj;
		return Objects.equals(birthDay, other.birthDay) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", password="
				+ password + ", name=" + name + ", phone=" + phone + ", birthDay=" + birthDay+"]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
