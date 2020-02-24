package com.bayareala8s.emarket.controller;


import com.bayareala8s.emarket.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestaurantServiceController {

    private static Map<Integer, Item> itemRepo = new HashMap<>();
    static {
        Item honey = new Item();

        honey.setId(1);
        honey.setName("Test");
        honey.setPrice(10.00);

        itemRepo.put(honey.getId(), honey);


    }

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ResponseEntity<Object> getItem() {

        return new ResponseEntity<>(itemRepo.values(), HttpStatus.OK);
    }
}
