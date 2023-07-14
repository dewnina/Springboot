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
@Table(name = "Submission")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="submission_date")
    private String submission_date;

    @Column(name="vendor_company")
    private String vendor_company;

    @Column(name="vendor_name")
    private String vendor_name;

    @Column(name="vendor_email_address")
    private String vendor_email_address;

    @Column(name="vendor_phone_number")
    private String vendor_phone_number;

    @Column(name="implementation_partner")
    private String implementation_partner;

    @Column(name="client_name")
    private String client_name;

    @Column(name="pay_rate")
    private String pay_rate;

    @Column(name="submuission_status")
    private String submuission_status;

    @Column(name="submission_type")
    private  String submission_type;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip")
    private String zip;

    @ManyToOne
    @JoinColumn(name="consultant_id")
    private consultant_detail consultant_detail;

    @OneToMany(mappedBy = "Submission", cascade = CascadeType.ALL)
    private List<Submission_update> Submission_update;





}
