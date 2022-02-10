package com.example.restaurant.wishlist.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Test
    public void searchTest(){
        var rst = wishListService.search("갈비집");

        System.out.println(rst);
        Assertions.assertNotNull(rst);
    }

}
