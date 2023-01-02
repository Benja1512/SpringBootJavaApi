package com.springboot.blog.payload;


import lombok.Data;

import java.util.List;
import java.util.stream.Collector;

@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;

}

