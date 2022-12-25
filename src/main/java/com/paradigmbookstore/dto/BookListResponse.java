package com.paradigmbookstore.dto;

import com.paradigmbookstore.model.BookStatus;
import com.paradigmbookstore.model.Category;
import lombok.Data;

import java.io.File;

@Data
public class BookListResponse {
    private String title;
    private String authorName;
    private BookStatus status;
    private Category category;
    private Integer lastPageNumber;
    private File file;
    private Long categoryId;
    private Integer totalPageNumber;
}
