package gr.aueb.cf.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "teachers")
public class Teacher extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;

    @ColumnDefault("true")
    @Column(name = "is_active", nullable = true)
    private Boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_category_id")
    private BranchCategory branchCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "perosnal_info_id")
    private PersonalInfo personalInfo;
}
