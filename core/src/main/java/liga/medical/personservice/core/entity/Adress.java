package liga.medical.personservice.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "adress")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String city;

    private String street;

    private String building;

    private String flat;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "contacts_adress",
            joinColumns = {@JoinColumn(name = "contact_id")},
            inverseJoinColumns = @JoinColumn(name = "adress_id"))
    private List<Contact> contacts;
}
