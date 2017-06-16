package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 기능을 수행하는 클래스
 * 각 메소드는 해당 기능을 수행한다.
 */
@Service
public class AmigoService {

    @Autowired
    private AmigoDao dao;
    /**
     *글쓰기
     * @param
     */

    public void registAmigo(Amigo amigo){

        dao.insertAmigo(amigo);
    }

    /**
     * 글 전체 보기
     * @return 전체 글
     */
    public List<Amigo> viewAmigos(){

        return null;
    }

    /**
     * 글 상세 보기
     * @return 글
     */
    public Amigo viewAmigo(String amigoId){

        return null;
    }


}