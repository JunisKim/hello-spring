package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostDaoSpringJdbc implements PostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertPost(Post post) {

        String query =
                "insert into post(title, content) VALUES (?, ?)";
        jdbcTemplate.update(
                query,
                post.getTitle(),
                post.getContent());
    }

    @Override
    public Post selectPostByPostSeq(String postSeq) {
        String query =
                "SELECT title, content" +
                        "FROM post";

        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Post post = new Post();
                    post.setTitle(rs.getString(1));
                    post.setContent(rs.getString(2));
                    return post;
                }, Integer.parseInt(postSeq));
    }




    @Override
    public List<Post> selectAllPosts() {
        String query =
                "SELECT title, content" +
                        "FROM post";

        return jdbcTemplate.query(query, new RowMapper<Post>() {
            @Override
            public Post mapRow(ResultSet rs, int i) throws SQLException {
                Post post = new Post();
                post.setTitle(rs.getString(1));
                post.setContent(rs.getString(2));
                return post;
            }
        });
    }
}
