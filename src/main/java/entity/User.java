package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String position;

    @OneToMany(mappedBy = "owner")
    private Set<Email> emails;

    @OneToMany(mappedBy = "owner")
    private Set<Phone> phones;

    @OneToOne/*(cascade = CascadeType.ALL)*/  //co to jest ta kaskada
    @JoinColumn(name = "address_id")
    private Address address;


    //prywatna lista kontaktow




}
