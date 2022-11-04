package liga.medical.personservice.core.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "role")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users=users;
    }
    public String getName() {
        return name;
    }

    public Long getId(){
        return id;
    }
    public void setIdId(Long id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
