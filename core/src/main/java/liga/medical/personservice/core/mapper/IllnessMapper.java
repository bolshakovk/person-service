package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.entity.Illness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IllnessMapper {
    @Select("SELECT " +
            "id, " +
            "medical_card_id as medicalCardId, " +
            "type_id as typeId, " +
            "heaviness, " +
            "appearance_dttm as appearanceDttm, " +
            "recovery_dt as recoveryDt " +
            "FROM illness;")
    List<Illness> getIllness();


    @Insert("INSERT INTO illness (id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) " +
            "VALUES (#{id}, #{medicalCardId}, #{typeId}, #{heaviness}, #{appearanceDttm}, #{recoveryDt})")
    Illness addIlness(Illness illness);
}
