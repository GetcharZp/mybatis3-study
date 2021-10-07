package cn.getcharzp.pojo;

import lombok.Data;

@Data
public class Article {
    private Integer id;
    private String title;
    private Cate cate;
}
