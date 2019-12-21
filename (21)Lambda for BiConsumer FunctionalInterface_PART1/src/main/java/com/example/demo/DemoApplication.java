package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

//      BiConsumer<Integer,String> biConsumer = (k,v)->System.out.println("Key:"+k+"\t"+"Value:"+v);
        map.forEach((k,v)->System.out.println("Key:"+k+"\t"+"Value:"+v));

        Map<Integer,Student> stuMap = new HashMap<>();
        stuMap.put(1001, new Student("Martin", 902892892L));
        stuMap.put(1002, new Student("Frank", 502892892L));
        stuMap.put(1003, new Student("Andrew", 302892892L));

        stuMap.forEach((k,v)->System.out.println("Key:"+k+"\t"+"Value:"+v));

    }
}
