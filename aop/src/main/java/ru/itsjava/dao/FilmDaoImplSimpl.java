package ru.itsjava.dao;

import org.springframework.stereotype.Component;
import ru.itsjava.domain.Film;

@Component
public class FilmDaoImplSimpl implements FilmDao{
    @Override
    public Film getFilmById(long filmId) {
        System.out.println("It's DAO");
        return new Film("Back to the Future", 1985);
    }
}
