package example.com.SpringbootDatabase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "consultant_detail")
public class consultant_detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String last_name;

    @Column (name="email_address")
    private String email_address;

    @Column(name="phone_number")
    private String phone_number;

    @ManyToOne
    @JoinColumn(name="lead_id")
    private lead_detail lead_detail;

    @OneToMany(mappedBy = "consultant_detail", cascade = CascadeType.ALL)
    private List<Submission> Submission;




}
