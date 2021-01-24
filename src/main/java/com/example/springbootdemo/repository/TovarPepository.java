package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Tovar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TovarPepository extends JpaRepository <Tovar,Long>{

}
