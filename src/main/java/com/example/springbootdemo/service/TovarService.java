package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Tovar;
import com.example.springbootdemo.repository.TovarPepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TovarService {

    private final TovarPepository tovarPepository;

    @Autowired
    public TovarService(TovarPepository tovarPepository) {
        this.tovarPepository = tovarPepository;
    }

    public Tovar findById(Long id){
return tovarPepository.getOne(id);
    }

    public List<Tovar> findAll(){
    return tovarPepository.findAll();
    }

    public Tovar saveTovar(Tovar tovar){
    return tovarPepository.save(tovar);
    }

    public void deleteById(Long id){
     tovarPepository.deleteById(id);
    }

}
