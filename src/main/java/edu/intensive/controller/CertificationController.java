package edu.intensive.controller;

import edu.intensive.Certification;
import edu.intensive.CertificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificationController {
    @Autowired
    CertificationService certificationService;
    @GetMapping(value = "/certifications/{studentId}/{courseId}", produces = "application/json;charset=UTF-8")
    public Certification getCertification(@PathVariable Long studentId, @PathVariable Long courseId) {

        Certification result = certificationService.getStudentLectureHistory(courseId, studentId);

        return result;
    }
}
