package builder;

import model.BoardDto;
import model.SubjectDto;

public class BoardBuilder {
    private String title;
    private String content;
    private String name;

    public BoardBuilder title(String title){
        this.title=title;
        return this;
}
    public BoardBuilder content(String content){
        this.content=content;
        return this;
    }
    public BoardBuilder name(String name){
        this.name=name;
        return this;
    }
    public BoardDto build(){
        return new BoardDto(title,content,name);
        //dto의 값(생성자)
    }

}
