package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.entity.MedicalCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalCardRepository extends JpaRepository<MedicalCard, Long> {
}