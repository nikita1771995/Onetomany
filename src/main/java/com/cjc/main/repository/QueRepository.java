package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Question;

//@Repository
public interface QueRepository extends JpaRepository<Question, Integer>
{

}
