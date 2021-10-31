package controller.board;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BoardService;

@Controller
@RequestMapping("board/*")
public class BoardController {

    @Setter(onMethod_ = @Autowired)
    BoardService service;

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        int total = service.totalCount();
        mv.addObject("boardList",service.readList());
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
