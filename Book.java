import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book {
	public Book() {	
	}
	public Book(long id, String name, String genre, AgeGroup ageGroup, BigDecimal price, LocalDate publicationDate,
			String author, int numberOfPages, String characteristics, String description, Languaje languaje) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.ageGroup = ageGroup;
		this.price = price;
		this.publicationDate = publicationDate;
		Author = author;
		this.numberOfPages = numberOfPages;
		this.characteristics = characteristics;
		this.description = description;
		this.languaje = languaje;
	}
	long id;
	String name;
	String genre;
	AgeGroup ageGroup;
	BigDecimal price;
	LocalDate publicationDate;
	String Author;
	int numberOfPages;
	String characteristics;
	String description;
	Languaje languaje;
	List<Order> orders;
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", genre=" + genre + ", ageGroup=" + ageGroup + ", price=" + price
				+ ", publicationDate=" + publicationDate + ", Author=" + Author + ", numberOfPages=" + numberOfPages
				+ ", characteristics=" + characteristics + ", description=" + description + ", languaje=" + languaje
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Author, ageGroup, characteristics, description, genre, id, languaje, name, numberOfPages,
				price, publicationDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Author, other.Author) && ageGroup == other.ageGroup
				&& Objects.equals(characteristics, other.characteristics)
				&& Objects.equals(description, other.description) && Objects.equals(genre, other.genre)
				&& id == other.id && languaje == other.languaje && Objects.equals(name, other.name)
				&& numberOfPages == other.numberOfPages && Objects.equals(price, other.price)
				&& Objects.equals(publicationDate, other.publicationDate);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public AgeGroup getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(AgeGroup ageGroup) {
		this.ageGroup = ageGroup;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Languaje getLanguaje() {
		return languaje;
	}
	public void setLanguaje(Languaje languaje) {
		this.languaje = languaje;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
