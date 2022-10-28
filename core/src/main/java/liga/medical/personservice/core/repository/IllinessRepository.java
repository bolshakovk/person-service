package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.Illness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllinessRepository extends JpaRepository<Illness, Long> {
}
