/*
Перед вами часть кода программы, которая по имени актера находит фильмы, где он сыграл.
Вот только сейчас она не запускается. Исправьте это.
Доработайте класс Movie. Реализуйте конструктор с параметрами, где задаётся название и год выхода фильма.
Переопределите методы equals(Object) и hashCode().
Доработайте класс Actor. Реализуйте конструктор с параметрами, где задаётся имя и фамилия актёра.
Переопределите методы equals(Object) и hashCode().
 */
package javaCore1.ClassObjectsMethods.task3;

import java.util.ArrayList;
import java.util.HashMap;

public class Practicum {
    public static void main(String[] args) {
        // Таблицы для хранения рейтингов фильмов и фильмографии актёров
        HashMap<Actor, ArrayList<Movie>> filmography = new HashMap<>();
        HashMap<Movie, Double> ratings = new HashMap<>();

        Movie ivanVasilievichMovie = new Movie("Иван Васильевич меняет профессию", 1973);
        Movie gentlemenOfFortuneMovie = new Movie("Джентльмены удачи", 1971);
        ratings.put(ivanVasilievichMovie, 8.6);
        ratings.put(gentlemenOfFortuneMovie, 8.5);

        Actor aDemyanenko = new Actor("Александр", "Демьяненко");

        ArrayList<Movie> actorMovies = new ArrayList<>();
        actorMovies.add(ivanVasilievichMovie);
        actorMovies.add(gentlemenOfFortuneMovie);

        filmography.put(aDemyanenko, actorMovies);

        if(filmography.containsKey(new Actor("Александр", "Демьяненко"))) {
            ArrayList<Movie> foundMovies = filmography.get(new Actor("Александр", "Демьяненко"));
            System.out.println("В фильмографии актёра А. Демьяненко найдены следующие фильмы: ");
            for (Movie movie : foundMovies) {
                if(ratings.containsKey(new Movie(movie.title, movie.releaseYear))) {
                    double rating = ratings.get(movie);
                    System.out.println("Фильм " + movie.description() + " с рейтингом " + rating);
                } else {
                    System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Movie.");
                }
            }
        } else {
            System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Actor.");
        }
    }
}