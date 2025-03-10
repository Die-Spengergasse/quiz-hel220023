package at.spengergasse.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "a_answers")
    public class Answer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "a_id")
        private int id;
        @Column(name = "a_text")
        private String text;
        @Column(name = "a_correct")
        private boolean correct;

        @OneToMany
        @JoinColumn(name = "fk_q_id")
        public List<Answer> answerList = new ArrayList<Answer>();

    }

