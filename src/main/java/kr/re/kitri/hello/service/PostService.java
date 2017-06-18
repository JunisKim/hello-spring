package kr.re.kitri.hello.service;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 글을 등록하고, 멤버에게 포인트를 10점 준다.
 */
@Service
public class PostService {

    @Autowired
    private PostDao postDao;


    /**
     *
     * 글쓰기
     */
    public void registPost(Post post) {
        postDao.insertPost(post);
    }

    /**
     * 상세 글보기
     * @param
     * @return 글
     */
    public Post viewPost(String postSeq) {
        return postDao.selectPostByPostSeq(postSeq);
    }

    /**
     * 전체 글보기
     */
    public List<Post> getPost() {
        return postDao.selectAllPosts();
    }


}
