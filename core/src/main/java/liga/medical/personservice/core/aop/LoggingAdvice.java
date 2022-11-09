package liga.medical.personservice.core.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.personservice.core.entity.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Aspect
@Slf4j
@Component
@RequiredArgsConstructor
public class LoggingAdvice {

    private static long idLog;
    private final PersonDataRepository personDataRepository;
    @Pointcut(value = "execution(* liga.medical.personservice.core.controller.*.*(..))")
    private void generalPointCut(){

    }
    @Around(value = "generalPointCut()")
    public Object applicationLogger(ProceedingJoinPoint proceedingJoinPoint) throws JsonProcessingException{
        //PersonData personData = personDataRepository.findByName("firstnameuser");
        //List<PersonData> personDataList = personDataRepository.findAll();
        ObjectMapper mapper = new ObjectMapper();
        String methodName = proceedingJoinPoint.getSignature().getName();
        String className = proceedingJoinPoint.getTarget().getClass().getName();

        log.info("invoke class : " + className + " method : " + methodName
                + "\ndate and time : " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now())
                +"\nid log: " + ++idLog);
                //+"\nusername: " + personDataList);

        Object obj = null;
        try {
            obj = proceedingJoinPoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        log.info(className + " with method " + methodName + " response: " + mapper.writeValueAsString(obj));
        return  obj;
    }
}
