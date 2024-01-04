package com.example.demo0104.Service;

import com.example.demo0104.Model.pmodel;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PService {
    public pmodel getp (){
java.util.Random random=new Random();
pmodel prod =new pmodel("Fioat","911",random.nextInt(100));
    }
}
