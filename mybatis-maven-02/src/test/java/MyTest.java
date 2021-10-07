import cn.getcharzp.helper.MybatisHelper;
import cn.getcharzp.mapper.ArticleMapper;
import cn.getcharzp.mapper.CateMapper;
import cn.getcharzp.pojo.Article;
import cn.getcharzp.pojo.Cate;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getArticles() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);
        List<Article> articles = mapper.getArticles();
        for (Article article : articles) {
            System.out.println(article);
        }
        sqlSession.close();
    }

    @Test
    public void getCates() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        CateMapper mapper = sqlSession.getMapper(CateMapper.class);
        List<Cate> cates = mapper.getCates();
        for (Cate cate : cates) {
            System.out.println(cate);
        }
        sqlSession.close();
    }
}
