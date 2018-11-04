package entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String number;

    private String zipcode;

    private String city;

}
