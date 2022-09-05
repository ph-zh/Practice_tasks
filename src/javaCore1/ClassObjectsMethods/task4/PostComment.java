package javaCore1.ClassObjectsMethods.task4;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }

        public void setText(String text) {
            this.text = text;
        }

        public void setWhoLiked(String[] whoLiked) {
            this.whoLiked = whoLiked;
        }
    }