package example.com.SpringbootDatabase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import jakarta.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lead_detail")
public class lead_detail {


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

    @OneToMany(mappedBy = "lead_detail", cascade = CascadeType.ALL)
    private List<consultant_detail> consultant_detail;

}


