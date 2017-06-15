package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-14.
 */
@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;


    public void insertAmigo(Amigo amigo) {

        try {
            //1. connection 확보
            Connection conn = dataSource.getConnection();

            System.out.println("connection ok..");

            //2. 쿼리를 생성 - PreparedStatement 생성
            String query =
                    "insert into amigo(amigo_name, amigo_number, amigo_email) VALUES(?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1,amigo.getAmigoName());
            pstmt.setString(2,amigo.getAmigoNumber());
            pstmt.setString(3,amigo.getAmigoEmail());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}