package com.lnut.problem.entity;

public class Problem {
    private Integer id;

    private Short type;

    private String content;

    private Short answer;

    private Short chapter;

    private Short section;

    private Short degree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Short getAnswer() {
        return answer;
    }

    public void setAnswer(Short answer) {
        this.answer = answer;
    }

    public Short getChapter() {
        return chapter;
    }

    public void setChapter(Short chapter) {
        this.chapter = chapter;
    }

    public Short getSection() {
        return section;
    }

    public void setSection(Short section) {
        this.section = section;
    }

    public Short getDegree() {
        return degree;
    }

    public void setDegree(Short degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", answer=" + answer +
                ", chapter=" + chapter +
                ", section=" + section +
                ", degree=" + degree +
                '}';
    }
}