package org.example;

import spark.Spark;

public class Main {
    public static void main(String[] args) {
        Spark.port(80);

        Spark.get("/", (req, res) -> "Hello World");
    }
}
