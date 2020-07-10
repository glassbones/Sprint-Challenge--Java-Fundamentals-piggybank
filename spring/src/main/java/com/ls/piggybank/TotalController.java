package com.ls.piggybank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class TotalController {

    // http://localhost:8080/data/allemployees
    //  http://localhost:2019/data/total
    /*
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal() {

        List<String> rtnCoins = null;
        String test = "hello";
        rtnCoins.add(PiggybankApplication.ourTotal.findCoins());

        return new ResponseEntity<>(test, HttpStatus.OK);
    }
    */

    //  http://localhost:2019/data/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal() {

        PiggybankApplication.ourTotal.totalCoins.sort((c1, c2) -> (int) (c1.getCoinid() - c2.getCoinid()));
        return new ResponseEntity<>(PiggybankApplication.ourTotal.totalCoins, HttpStatus.OK);

    }

}


