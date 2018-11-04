package entity;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;

    private ContactType type;


    @OneToMany
    @JoinColumn(name = "user_id")
    private User owner;
}
