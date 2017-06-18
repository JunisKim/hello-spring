package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class MemberService {

    private String signIn;

    @Autowired
    private MemberDao memberDao;

}
