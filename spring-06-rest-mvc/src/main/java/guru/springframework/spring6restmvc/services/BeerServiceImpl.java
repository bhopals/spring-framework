package guru.springframework.spring6restmvc.services;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();

        Beer beer1 = new Beer();        		
        beer1.setId(UUID.randomUUID());
        beer1.setVersion(1);
        beer1.setBeerName("Galaxy Cat");
        beer1.setBeerStyle(BeerStyle.PALE_ALE);
        beer1.setUpc("12356");
        beer1.setPrice(new BigDecimal("12.99"));
        beer1.setQuantityOnHand(122);
        beer1.setCreatedDate(LocalDateTime.now());
        beer1.setUpdateDate(LocalDateTime.now());
                
        Beer beer2 = new Beer();        		
        beer2.setId(UUID.randomUUID());
        beer2.setVersion(1);
        beer2.setBeerName("Crank");
        beer2.setBeerStyle(BeerStyle.PALE_ALE);
        beer2.setUpc("12352331236");
        beer2.setPrice(new BigDecimal("11.99"));
        beer2.setQuantityOnHand(122);
        beer2.setCreatedDate(LocalDateTime.now());
        beer2.setUpdateDate(LocalDateTime.now());
        		
        Beer beer3 = new Beer();        		
        beer3.setId(UUID.randomUUID());
        beer3.setVersion(1);
        beer3.setBeerName("Sunshine City");
        beer3.setBeerStyle(BeerStyle.IPA);
        beer3.setUpc("123562222");
        beer3.setPrice(new BigDecimal("10.99"));
        beer3.setQuantityOnHand(122);
        beer3.setCreatedDate(LocalDateTime.now());
        beer3.setUpdateDate(LocalDateTime.now());
        	
        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public void patchBeerById(UUID beerId, Beer beer) {
        Beer existing = beerMap.get(beerId);

        if (StringUtils.hasText(beer.getBeerName())){
            existing.setBeerName(beer.getBeerName());
        }

        if (beer.getBeerStyle() != null) {
            existing.setBeerStyle(beer.getBeerStyle());
        }

        if (beer.getPrice() != null) {
            existing.setPrice(beer.getPrice());
        }

        if (beer.getQuantityOnHand() != null){
            existing.setQuantityOnHand(beer.getQuantityOnHand());
        }

        if (StringUtils.hasText(beer.getUpc())) {
            existing.setUpc(beer.getUpc());
        }
    }

    @Override
    public void deleteById(UUID beerId) {
        beerMap.remove(beerId);
    }

    @Override
    public void updateBeerById(UUID beerId, Beer beer) {
        Beer existing = beerMap.get(beerId);
        existing.setBeerName(beer.getBeerName());
        existing.setPrice(beer.getPrice());
        existing.setUpc(beer.getUpc());
        existing.setQuantityOnHand(beer.getQuantityOnHand());
    }

    @Override
    public List<Beer> listBeers(){
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {

       System.out.println("Get Beer by Id - in service. Id: " + id.toString());

        return beerMap.get(id);
    }

    @Override
    public Beer saveNewBeer(Beer beer) {

        Beer savedBeer = new Beer();        		
        savedBeer.setId(UUID.randomUUID());
        savedBeer.setVersion(1);
        savedBeer.setBeerName(beer.getBeerName());
        savedBeer.setBeerStyle(beer.getBeerStyle());
        savedBeer.setUpc(beer.getUpc());
        savedBeer.setPrice(beer.getPrice());
        savedBeer.setQuantityOnHand(beer.getQuantityOnHand());
        savedBeer.setCreatedDate(LocalDateTime.now());
        savedBeer.setUpdateDate(LocalDateTime.now());
        beerMap.put(savedBeer.getId(), savedBeer);

        return savedBeer;
    }
}

















