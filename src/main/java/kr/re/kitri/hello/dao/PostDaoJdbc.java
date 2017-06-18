package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class PostDaoJdbc implements PostDao{

    @Autowired
    private DataSource dataSource;

    /**
     * 글 입력
     * @param post
     */
    @Override
    public void insertPost(Post post) {
        //1. 연결확보
        Connection conn = null;
        try {
            conn = dataSource.getConnection();

        //2. 쿼리를 생성 - PreparedStatement 생성
        String query =
                "insert into post(title, content) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, post.getTitle());
            pstmt.setString(2, post.getContent());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Post selectPostByPostSeq(String postSeq) {
        return null;
    }

    @Override
    public List<Post> selectAllPosts() {
        return null;
    }
}
