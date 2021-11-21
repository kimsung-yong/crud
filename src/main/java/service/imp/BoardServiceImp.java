package service.imp;

import vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BoardService;
import vo.Criteria;

import java.util.List;
@Log4j
@Service
public class BoardServiceImp implements BoardService {
    @Setter(onMethod_ = @Autowired)
    BoardMapper mapper;

    @Override
    public List<BoardVO> readList(Criteria cri) {
        return mapper.list(cri);
    }

    @Override
    public BoardVO get(BoardVO vo) {
        return mapper.get(vo);
    }

    @Override
    public int totalCount(Criteria cri) {
        return mapper.total(cri);
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
