package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "emils")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Enumerated
    private ContactType type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
}
