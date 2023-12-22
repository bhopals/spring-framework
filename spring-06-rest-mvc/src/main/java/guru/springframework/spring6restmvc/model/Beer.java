package guru.springframework.spring6restmvc.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

/**
 * Created by jt, Spring Framework Guru.
 */
@Builder
@Data
public class Beer {
    private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public BeerStyle getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(BeerStyle beerStyle) {
		this.beerStyle = beerStyle;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(beerName, beerStyle, createdDate, id, price, quantityOnHand, upc, updateDate, version);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beer other = (Beer) obj;
		return Objects.equals(beerName, other.beerName) && beerStyle == other.beerStyle
				&& Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price) && Objects.equals(quantityOnHand, other.quantityOnHand)
				&& Objects.equals(upc, other.upc) && Objects.equals(updateDate, other.updateDate)
				&& Objects.equals(version, other.version);
	}
	@Override
	public String toString() {
		return "Beer [id=" + id + ", version=" + version + ", beerName=" + beerName + ", beerStyle=" + beerStyle
				+ ", upc=" + upc + ", quantityOnHand=" + quantityOnHand + ", price=" + price + ", createdDate="
				+ createdDate + ", updateDate=" + updateDate + "]";
	}
    
    
}
