package edu.intensive;

import edu.intensive.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @Autowired
    CertificationRepository certificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureCompleted(@Payload LectureCompleted lectureCompleted) {
        if(lectureCompleted.isMe()) {
            Certification certification = new Certification();
            certification.setCourseId(lectureCompleted.getCourseId());
            certification.setStatus("Certified");
            certification.setStudentId(lectureCompleted.getStudentId());

            certificationRepository.save(certification);
        }
    }
}
