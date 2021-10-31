package mapper;

import vo.BoardVO;

import java.util.List;

public interface BoardMapper {

    public int total();

    public List<BoardVO> list();

    public int insert(BoardVO vo);

    public int update(BoardVO vo);

    public int delete(int bno);

}
