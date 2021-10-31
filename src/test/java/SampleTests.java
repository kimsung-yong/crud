import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.Restaurant;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:../../web/WEB-INF/spring/dispatcher-servlet.xml")
@Log4j
public class SampleTests {

    @Setter(onMethod_ = @Autowired)
    private Restaurant restaurant;

    @Test
    public void testExitst(){

        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("------------------------");
        log.info(restaurant.getChef());

    }

}
