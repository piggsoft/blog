/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2018/1/23                           Create
 */
package com.piggsoft.blog.repository;

import com.piggsoft.blog.po.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2018/1/23
 * @since 1.0
 */
public interface BlogRepository extends ElasticsearchRepository<Blog, Long> {
}
