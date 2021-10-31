import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mapper.TimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/resources/spring/applicationContext.xml")
public class TimeMapperTests {

    @Setter(onMethod_ = @Autowired)
    private TimeMapper timeMapper;

    @Test
    public void timeMapperTest(){
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());
    }

    public void timeMapeerTest2(){
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime2());
    }


}
