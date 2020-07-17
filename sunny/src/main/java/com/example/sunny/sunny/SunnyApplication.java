package com.example.sunny.sunny;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SunnyApplication{

	
	  public static void main(String[] args) {
	  SpringApplication.run(SunnyApplication.class, args); }
	 

	/*
	 * public static void main(String[] args) {
	 * 
	 * String str = "Suresh::Sunita";
	 * 
	 * String[] result = str.split("\\::"); String fst = result[0]; String last =
	 * result[result.length-1]; if(result.length<3) { last=null; }
	 * System.out.println("First :> "+fst+" Last :> "+last);
	 * 
	 * 
	 * 
	 * IntStream .range(1, 10) .skip(5) .forEach(x -> System.out.println(x));
	 * 
	 * 
	 * System.out.println(IntStream .range(1, 10) .sum());
	 * 
	 * Stream.of("Sunil","Saanvi") .sorted() .findFirst()
	 * .ifPresent(System.out::println); }
	 */

}