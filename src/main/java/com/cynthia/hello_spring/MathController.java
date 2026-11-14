package com.cynthia.hello_spring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class MathController {

    @GetMapping("/pow/{base}/{exp}")
    public double power(@PathVariable double base,@PathVariable double exp){
        return Math.pow(base,exp);
    }
    @GetMapping("/max")
    public int maximum(@RequestParam int a,@RequestParam int b){
        return Math.max(a,b);
    }
}
