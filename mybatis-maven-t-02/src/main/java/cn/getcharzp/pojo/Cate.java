package cn.getcharzp.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Cate {
    private Integer id;
    private String name;
    private List<Article> articles;
}
