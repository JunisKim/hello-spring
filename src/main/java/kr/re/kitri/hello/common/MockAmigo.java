package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockAmigo {
    public List<Amigo> getAmigo() {

        List<Amigo> list = new ArrayList<>();

        Amigo a = new Amigo();
        a.setAmigoName("허민");
        a.setAmigoNumber("01010");
        a.setAmigoEmail("asdg@naver.com");
        list.add(a);

        a = new Amigo();
        a.setAmigoName("황순성");
        a.setAmigoNumber("01010");
        a.setAmigoEmail("asdg@naver.com");
        list.add(a);

        a = new Amigo();
        a.setAmigoName("김세원");
        a.setAmigoNumber("01010");
        a.setAmigoEmail("asdg@naver.com");
        list.add(a);

        a = new Amigo();
        a.setAmigoName("김태준");
        a.setAmigoNumber("01010");
        a.setAmigoEmail("asdg@naver.com");
        list.add(a);

        return list;
    }
}
