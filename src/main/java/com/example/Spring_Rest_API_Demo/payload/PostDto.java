package com.example.Spring_Rest_API_Demo.payload;

import lombok.Data;

@Data
public class PostDto {
    private Long Id;
    private String title;
    private String description;
    private String Content;


}
