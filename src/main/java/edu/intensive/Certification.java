package edu.intensive;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Certification {
    @Id
    @GeneratedValue
    Long certificationId;
    Long studentId;
    Long courseId;
    String status;
}
