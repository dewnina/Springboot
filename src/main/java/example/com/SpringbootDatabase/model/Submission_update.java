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
@Table(name = "Submission_update")
public class Submission_update {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="update_text")
    private String update_text;

    @Column(name="created_date")
    private String created_date;

    @ManyToOne
    @JoinColumn(name="submission_id")
    private Submission Submission;

}
