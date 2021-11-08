package controller.board;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BoardService;
import vo.Criteria;
import vo.PageDTO;

@Controller
@RequestMapping("board/*")
public class BoardController {

    @Setter(onMethod_ = @Autowired)
    BoardService service;

    @RequestMapping("list")
    public ModelAndView list(ModelAndView mv, Criteria cri){

        mv.addObject("boardList",service.readList(cri));
        mv.addObject("pageMaker",new PageDTO(cri,service.totalCount(cri)));
        mv.setViewName("board/list");

        return mv;
    }

    @RequestMapping("get")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("modity")
    public ModelAndView modify(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }
    @RequestMapping("remove")
    public ModelAndView remove(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }


}
