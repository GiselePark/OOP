package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

public class Board {
    private int id;
    private String title;
    private String content;
    private String name;

    @Builder(builderMethodName = "builder")
    public Board(String title, String content, String name) {
        this.title = title;
        this.content = content;
        this.name = name;
    }
}
