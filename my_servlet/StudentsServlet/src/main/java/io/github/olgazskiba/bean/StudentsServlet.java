package io.github.olgazskiba.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class StudentsServlet {
    public static List<StudentsServlet> total = new ArrayList<>();

    private Integer id;
    private String name;
    private String lastName;
    private int age;

}
