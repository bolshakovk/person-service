package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.entity.Illness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllnessRepository extends JpaRepository<Illness, Long> {
}
