package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.AmigoService;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-12.
 * /bbs .. 전체보기
 * /bbs/<articleId> .. 상세보기
 * /bbs/<articleId>/modify .. 수정
 * /bbs/<articleId>/remove .. 삭제
 *
 * /bbs/write .. 글 작성 화면 로딩
 * /bbs/write/do .. 글 작성하기
 *
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    /**
     * \
     * 전체보기
     *
     * @return
     */
    @RequestMapping("")
    public ModelAndView viewAll() {

        /*amigo .. 전체보기*/
        //전체보기를 하기 위한 데이터를 가져온다.
        MockAmigo mock = new MockAmigo();
        List<Amigo> list = mock.getAmigo();

        return new ModelAndView("amigo/amigo_regist_home")
                .addObject("list", list);
    }

    @RequestMapping("/{amigoName}")
    public ModelAndView viewDetail(@PathVariable String amigoName)/*(@PathVariable("amigoName") String amigoName)*/ {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/view_name");
        mav.addObject("amigoName", amigoName);
        return mav;
    }

    @GetMapping("/regist")
    public String regist() {
        return "amigo/regist";
    }

    @PostMapping("/regist")
    public ModelAndView doRegist(Amigo amigo) {

        System.out.println(amigo);

        service.registAmigo(amigo);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/go_regist");
        mav.addObject("amigo", amigo);

        return mav;
    }
}