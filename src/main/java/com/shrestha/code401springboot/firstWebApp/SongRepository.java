package com.shrestha.code401springboot.firstWebApp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {
//    public List<Song> findByNameInEnglish(String nameInEnglish);
}
