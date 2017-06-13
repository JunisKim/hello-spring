package kr.re.kitri.hello.controller;
import kr.re.kitri.hello.controller.model.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {

    @RequestMapping("/amigo")
    public String amigoRegistHome(){
        return "/amigo/amigo_regist_home";
    }

    @RequestMapping("/amigo/{amigoName}")
    public ModelAndView viewName(@PathVariable("amigoName") String amigoId) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/amigo/view_name");
        mav.addObject("amigoName", amigoId);
        return mav;
        }

    @RequestMapping(value="/amigo/regist", method= RequestMethod.GET)
    public String regist(){
        return "/amigo/regist";
        }

    @RequestMapping(value="/amigo/regist", method=RequestMethod.POST)
    public ModelAndView goRegist(Amigo amigo){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/amigo/go_regist");
        mav.addObject("amigo", amigo);
        System.out.println(amigo);
        return mav;
    }
}
