package com.library.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
}
