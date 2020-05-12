package model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Car {

    private int id;
    private String model;
    private int power;
    private int mileage;

}
