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

    //public String returner

    //  http://localhost:2019/data/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal() {

        PiggybankApplication.ourTotal.setSum();
        PiggybankApplication.ourTotal.totalCoins.sort((c1, c2) -> (int) (c1.getCoinid() - c2.getCoinid()));
        String response = "The piggy bank holds " + Double.toString(PiggybankApplication.ourTotal.getSum());

        return new ResponseEntity<>(PiggybankApplication.ourTotal.totalCoins.toString() + response, HttpStatus.OK);

    }

}


