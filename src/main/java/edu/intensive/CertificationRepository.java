package edu.intensive;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CertificationRepository extends PagingAndSortingRepository<Certification, Long> {
    public Certification findByCourseIdAndStudentId(Long courseId, Long studentId);
}
