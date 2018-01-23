/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2018/1/23                           Create
 */
package com.piggsoft.blog.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2018/1/23
 * @since 1.0
 * Relational DB -> Databases -> Tables -> Rows -> Columns
 * Elasticsearch -> Indices   -> Types  -> Documents -> Fields
 */
@Document(indexName = "es-blog", type = "blog")
public class Blog {
    @Id
    private Long id;
    private String title;
    private String tag;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
