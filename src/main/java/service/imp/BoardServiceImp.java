package service.imp;

import vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BoardService;

import java.util.List;
@Log4j
@Service
public class BoardServiceImp implements BoardService {
    @Setter(onMethod_ = @Autowired)
    BoardMapper mapper;

    @Override
    public List<BoardVO> readList() {
        return mapper.list();
    }

    @Override
    public int totalCount() {
        return mapper.total();
    }

    @Override
    public int regester(BoardVO vo) {
        return mapper.insert(vo);
    }

    @Override
    public int modify(BoardVO vo) {
        return mapper.update(vo);
    }

    @Override
    public int remove(int bno) {
        return mapper.delete(bno);
    }
}
