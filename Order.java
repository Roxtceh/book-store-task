import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
	public Order() {
	}
	
	public Order(long id, long clientId, long employeeId, long bookId, int numberOfBooks, LocalDateTime orderDate,
			BigDecimal price) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.employeeId = employeeId;
		this.bookId = bookId;
		this.numberOfBooks = numberOfBooks;
		this.orderDate = orderDate;
		this.price = price;
	}

	long id;
	long clientId;
	long employeeId;
	long bookId;
	int numberOfBooks;
	LocalDateTime orderDate;
	BigDecimal price;
	Client client;
	Employee employee;
	Book book;
	
	@Override
	public int hashCode() {
		return Objects.hash(bookId, clientId, employeeId, id, numberOfBooks, orderDate, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return bookId == other.bookId && clientId == other.clientId && employeeId == other.employeeId && id == other.id
				&& numberOfBooks == other.numberOfBooks && Objects.equals(orderDate, other.orderDate)
				&& Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", clientId=" + clientId + ", employeeId=" + employeeId + ", bookId=" + bookId
				+ ", numberOfBooks=" + numberOfBooks + ", orderDate=" + orderDate + ", price=" + price + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
