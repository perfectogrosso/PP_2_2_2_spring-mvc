package web.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Car {
    private Long id;
    private String color;
    private int horsePowers;

    public Car(){

    }
    public Car(Long id, String color, int horsePowers) {
        this.id = id;
        this.color = color;
        this.horsePowers = horsePowers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
}
