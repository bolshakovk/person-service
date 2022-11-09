package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.entity.Adress;
import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.entity.Illness;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
