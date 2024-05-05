package ma.emsi.student_pay_managment_fullstuck.repository;

import ma.emsi.student_pay_managment_fullstuck.entities.Payment;
import ma.emsi.student_pay_managment_fullstuck.entities.PaymentStatus;
import ma.emsi.student_pay_managment_fullstuck.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findByStudentCode(String code);

    List<Payment> findByStatus(PaymentStatus status);

    List<Payment> findByType(PaymentType type);

}
