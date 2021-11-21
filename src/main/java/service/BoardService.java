package service;

import vo.BoardVO;
import vo.Criteria;

import java.util.List;


public interface BoardService {

    public List<BoardVO> readList(Criteria cri);
    public BoardVO get(BoardVO vo);
    public int totalCount(Criteria cri);
    public int regester(BoardVO vo);
    public int modify(BoardVO vo);
    public int remove(int bno);

}
