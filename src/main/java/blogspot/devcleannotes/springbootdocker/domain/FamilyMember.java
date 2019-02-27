package blogspot.devcleannotes.springbootdocker.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class FamilyMember {

    @Id
    @GeneratedValue
    private Long id;


    private String firstName;
    private String lastName;


}
