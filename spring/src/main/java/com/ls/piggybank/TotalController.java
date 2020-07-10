package com.ls.piggybank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//@RequestMapping("/data")
public class TotalController {

    //public String returner

    /*

    //  http://localhost:2019/data/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal() {

        //PiggybankApplication.ourTotal.setSum();
        PiggybankApplication.ourTotal.totalCoins.sort((c1, c2) -> (int) (c1.getCoinid() - c2.getCoinid()));
        String finalResponse = "The piggy bank holds " + Double.toString(PiggybankApplication.ourTotal.getSum());
        //List<String> res = Collections.singletonList(PiggybankApplication.ourTotal.totalCoins.toString());
        String res = PiggybankApplication.ourTotal.totalCoins.toString();

        return new ResponseEntity<>(res + finalResponse , HttpStatus.OK);
        //return new ResponseEntity<>(res, HttpStatus.OK);

    }

    */
    

    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal() {

        //PiggybankApplication.ourTotal.setSum();
        PiggybankApplication.ourTotal.totalCoins.sort((c1, c2) -> (int) (c1.getCoinid() - c2.getCoinid()));
        String finalResponse = "The piggy bank holds " + Double.toString(PiggybankApplication.ourTotal.getSum());
        //List<String> res = Collections.singletonList(PiggybankApplication.ourTotal.totalCoins.toString());
        List<String> list = new ArrayList <>();
        PiggybankApplication.ourTotal.totalCoins.forEach(e -> e.addToList(list));
        list.add(finalResponse);

        return new ResponseEntity<>(list, HttpStatus.OK);
        //return new ResponseEntity<>(res, HttpStatus.OK);

    }

    /*

    // http://localhost:2019/money/{amount}

    @PutMapping(path = "/money/{amount}",
            consumes = {"application/json"},
            produces = {"application/json"})
    public ResponseEntity<?> changeMoney(@PathVariable double amount) {

        double total = PiggybankApplication.ourTotal.getSum();

        if (amount >= total){

        }
        return "yoooo";


    }

    */

}


