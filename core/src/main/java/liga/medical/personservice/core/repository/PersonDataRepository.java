package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.entity.PersonData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDataRepository extends JpaRepository<PersonData, Long> {
    @Select("select id, " +
            "first_name," +
            " last_name," +
            " birth_date" +
            " age" +
            " sex" +
            " from person_data where id = #{dataId}")
    Contact getById(@Param("dataId") Long dataId);
}