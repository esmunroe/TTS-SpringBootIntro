package com.tts.springbootintro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.springbootintro.models.Intro;

@Repository
public interface IntroRepository extends CrudRepository<Intro, Long> {

}
