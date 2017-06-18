package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *  /post/write (GET) ...글쓰기 화면
 *  /post/write (POST) .. 글 쓰기
 *
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    /**
     * 전체보기
     */
    @RequestMapping("")
    public ModelAndView viewAll() {

        //전체보기를 하기위한 데이터를 가져온다.
        List<Post> list = postService.getPost();

        return new ModelAndView("post/view_all")
                .addObject("list", list);
    }

    /**
     * 글 상세보기
     * @param articleId
     */
    @RequestMapping("/{postSeq}")
    public ModelAndView viewDetail(@PathVariable String postSeq) {

        Post post = postService.viewPost(postSeq);

        return new ModelAndView("post/view_detail")
                .addObject("post", post);
    }

    /**
     * 글쓰기 화면 보기
     */
    @GetMapping("/write")
    public String write() {
        return "post/write";
    }

    /**
     * 실제 글쓰기
     */
    @PostMapping("/write")
    public ModelAndView doWrite(Post post) {
        System.out.println(post);
        postService.registPost(post);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("post/do_regist");
        mav.addObject("post", post);

        return mav;
    }
}


