package service;

import VO.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {

    public List<BoardVO> list();
    public int insert();
    public int modify();

}
