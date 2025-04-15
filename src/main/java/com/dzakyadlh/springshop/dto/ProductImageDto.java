package com.dzakyadlh.springshop.dto;

import lombok.Data;

@Data
public class ProductImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;
}
