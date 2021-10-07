package cn.getcharzp.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Article {
    private Integer id;
    private String title;
    private Cate cate;
}
