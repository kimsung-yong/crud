package service;

import vo.BoardVO;

import java.util.List;


public interface BoardService {

    public List<BoardVO> readList();
    public int totalCount();
    public int regester(BoardVO vo);
    public int modify(BoardVO vo);
    public int remove(int bno);

}
