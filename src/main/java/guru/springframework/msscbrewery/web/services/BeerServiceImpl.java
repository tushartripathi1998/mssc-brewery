package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        BeerDto beerDto = new BeerDto();
        beerDto.setId(UUID.randomUUID());
        beerDto.setBeerName("Galaxy Cat");
        beerDto.setBeerStyle("Pale Ale");
        return beerDto;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        BeerDto beerDto1 = new BeerDto();
        beerDto1.setId(UUID.randomUUID());
        return beerDto1;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //add impl to update the beer
    }

    @Override
    public void deleteById(UUID beerId) {
        System.out.println("deleting a beer ... ");
    }
}
