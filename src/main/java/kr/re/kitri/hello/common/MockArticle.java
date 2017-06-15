package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockArticle {

    public List<Article> getArticles() {

        List<Article> list = new ArrayList<>();

        Article a = new Article();
        a.setArticleId("1");
        a.setTitle("1번 게시물입니다.");
        a.setName("박찬호");
        a.setContent("박찬호는 한때 메이저리그에서 잘 던졌습니다. 아이엠에프때 많은 사람들에게 희망을 주었다.");
        list.add(a);

        a = new Article();
        a.setArticleId("2");
        a.setTitle("2번 게시물입니다.");
        a.setName("박세리");
        a.setContent("박세리는 한때 LPGA에서 잘 쳤습니다. 아이엠에프때 많은 사람들에게 희망을 주었다.");
        list.add(a);

        a = new Article();
        a.setArticleId("3");
        a.setTitle("3번 게시물입니다.");
        a.setName("스칼렛 요한슨");
        a.setContent("스칼렛 요한슨 괜찮아요");
        list.add(a);

        a = new Article();
        a.setArticleId("4");
        a.setTitle("4번 게시물입니다.");
        a.setName("박지성");
        a.setContent("맨체스터 유나이티드 박지성");
        list.add(a);

        a = new Article();
        a.setArticleId("5");
        a.setTitle("5번 게시물입니다.");
        a.setName("류현진");
        a.setContent("LA다저스 투수 류현진.");
        list.add(a);

        return list;
    }
}
