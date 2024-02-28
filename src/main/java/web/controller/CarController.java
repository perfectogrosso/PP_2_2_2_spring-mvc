package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarServiceImpl carService = new CarServiceImpl();
    @GetMapping("/cars")
    public String displayCars(Model model, @RequestParam(value = "count", required = false) Integer count){
        if(count == null){
            model.addAttribute(carService.returnCars(5));
        }else model.addAttribute(carService.returnCars(count));
        return "cars";
    }
}
