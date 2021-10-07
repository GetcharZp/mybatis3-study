package cn.getcharzp.mapper;

import cn.getcharzp.pojo.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {
    List<Article> getArticles();

    List<Article> getArticlesIf(Map map);
}
