package controller.board;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import service.BoardService;
import vo.BoardVO;
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

    @RequestMapping({"get","modify"})
    public ModelAndView get(BoardVO vo,Criteria cri){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/get");
        mv.addObject("content",service.get(vo));
        mv.addObject("pageMaker",cri);
        return mv;
    }
    @RequestMapping("remove")
    public ModelAndView remove(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("save")
    public ModelAndView regist(Criteria cri, BoardVO vo){
        ModelAndView mv = new ModelAndView();

        int result = service.regester(vo);
        if(result  == 1 ){
            String alarm = "저장에 성공하셧습니다";
            mv.addObject("result",alarm);
            RedirectView rv = new RedirectView("list");
            rv.setExposeModelAttributes(false);
            return new ModelAndView(rv);
        }else{
            String alarm = "저장에 실패하셧습니다";
        }
        return mv;
    }

}
