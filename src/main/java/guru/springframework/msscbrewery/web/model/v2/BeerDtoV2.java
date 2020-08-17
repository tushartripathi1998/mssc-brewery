package guru.springframework.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private BeerStyleEnum beerStyleEnum;
    private Long upc;

    public BeerDtoV2(String beerName, String beerStyle, BeerStyleEnum beerStyleEnum, Long upc) {
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.beerStyleEnum = beerStyleEnum;
        this.upc = upc;
    }

    public BeerDtoV2(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getBeerStyle() {
        return beerStyle;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public BeerStyleEnum getBeerStyleEnum() {
        return beerStyleEnum;
    }

    public void setBeerStyleEnum(BeerStyleEnum beerStyleEnum) {
        this.beerStyleEnum = beerStyleEnum;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    @Override
    public String toString() {
        return "BeerDtoV2{" +
                "id=" + id +
                ", beerName='" + beerName + '\'' +
                ", beerStyle='" + beerStyle + '\'' +
                ", beerStyleEnum=" + beerStyleEnum +
                ", upc=" + upc +
                '}';
    }
}
