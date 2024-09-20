package gr.aueb.cf.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "personal_info")
public class PersonalInfo extends AbstractEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
