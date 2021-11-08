package mapper;

import vo.BoardVO;
import vo.Criteria;

import java.util.List;

public interface BoardMapper {

    public int total(Criteria cri);

    public List<BoardVO> list(Criteria cri);

    public int insert(BoardVO vo);

    public int update(BoardVO vo);

    public int delete(int bno);

}
