package guru.springframework.msscbrewery.web.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        BeerDtoV2 beerDtoV2 = new BeerDtoV2();
        beerDtoV2.setId(UUID.randomUUID());
        beerDtoV2.setBeerName("Galaxy Cat");
        beerDtoV2.setBeerStyle("Pale Ale");
        return beerDtoV2;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }

//    @Override
//    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
//
//    }
//
//    @Override
//    public BeerDto saveNewBeer(BeerDto beerDto) {
//        return BeerDto.builder()
//                .id(UUID.randomUUID())
//                .build();
//    }
//
//    @Override
//    public void updateBeer(UUID beerId, BeerDto beerDto) {
//        //add impl to update the beer
//    }
//
//    @Override
//    public void deleteById(UUID beerId) {
//        log.debug("deleting a beer ... ");
//    }
}
