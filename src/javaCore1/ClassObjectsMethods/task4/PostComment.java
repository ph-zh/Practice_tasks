package javaCore1.ClassObjectsMethods.task4;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    @Override
    public String toString() {
        String result = "PostComment {text='" + text + '\'';
        return result + ", whoLiked=" + Arrays.toString(whoLiked) + '}';
    }

    public String getText() {
        return text;
    }

    public String setText() {
        return text;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public String[] setWhoLiked() {
        return whoLiked;
    }
}