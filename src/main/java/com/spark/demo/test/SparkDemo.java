package com.spark.demo.test;


import static spark.Spark.*;

/**
 * @Author: Wch
 * @Date 2018/6/26
 */
public class SparkDemo {
    public static void main(String[] args) {
        System.out.println("start spark");
        port(8080); // Spark will run on port 8080
        get("/hello", (req, res) -> "hello wch");
        System.out.println("spark is ok");
    }

}
