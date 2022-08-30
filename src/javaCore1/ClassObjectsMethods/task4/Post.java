package javaCore1.ClassObjectsMethods.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии


/* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

    @Override
    public String toString() {
        String result = "Post {title='" + title + '\'';
        if (content != null) {
            result = result + ", content.length=" + content.length();
        } else {
            result = result + ", content=null";
        }
        return result + ", tags=" + Arrays.toString(tags) + '\'' + '}';
    }

    public String getTitle() {
        return title;
    }

    public String setTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String setContent() {
        return content;
    }

    public String[] getTags() {
        return tags;
    }

    public String[] setTags() {
        return tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }

    public ArrayList<PostComment> setComments() {
        return comments;
    }
}