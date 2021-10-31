import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.BoardService;
import vo.BoardVO;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
@Log4j
public class BoardServiceTests {
    @Setter(onMethod_ = @Autowired)
    BoardService service;
    @Test
    public void testTotalService() {
        log.info(service.totalCount());
        assertNotNull(service.totalCount());

    }
    @Test
    public void testListService(){
        log.info(service.readList());
        assertNotNull(service.readList());
    }
    @Test
    public void testInsertService(){
        BoardVO vo = new BoardVO();
        vo.setContent("저장 내용테스트");
        vo.setTitle("저장 제목 테스트");
        vo.setWriter("테스트 김성연");
        vo.setTypeno(3);

        log.info(service.regester(vo));
        assertNotNull(service.regester(vo));

    }

    @Test
    public void testUpdateService(){
        BoardVO vo = new BoardVO();
        vo.setBno(8185);
        vo.setTypeno(4);
        vo.setContent("업데이트 테스트 입니다");
        vo.setTitle("업데이트 테스트 입니다");

        log.info(service.modify(vo));
    }
    @Test
    public void testDeleteService(){
        log.info(service.remove(8185));
    }

    @Test
    public void testGetTotalService(){
        log.info(service.totalCount());
    }
}
