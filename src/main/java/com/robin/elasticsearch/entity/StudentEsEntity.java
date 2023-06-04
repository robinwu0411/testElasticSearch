package com.robin.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@Document(indexName = "student")
public class StudentEsEntity implements Serializable {

    @Id
    @Field(name = "id", type = FieldType.Keyword)
    private Long id;

    @Field(name = "age", type = FieldType.Integer)
    private Integer age;

    @Field(name = "age", type = FieldType.Text)
    private String name;
}
