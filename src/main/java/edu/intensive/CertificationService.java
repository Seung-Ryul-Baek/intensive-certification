package edu.intensive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificationService {
    @Autowired
    CertificationRepository certificationRepository;

    public Certification getStudentLectureHistory(Long courseId, Long studentId) {
        return certificationRepository.findByCourseIdAndStudentId(courseId, studentId);
    }
}
