//package com.shrestha.code401springboot.firstWebApp;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//// Mark this class as a controller, so that SpringBoot Knows to look at it
//@RestController
//public class HelloWorldController {
//
//    // specity the route for this method
//    @GetMapping("/")
//    public String getHelloWorld() {
//        return "Hello, World!!!";
//    }
//
//    @GetMapping("/hello/{name}/{from}")
//    public String getHelloToMe(@PathVariable String name, @PathVariable String from) {
//        return "Hello there, " + name + " from " + from;
//    }
//
//    @GetMapping("/capitalize")
//    public String capitalize(@RequestParam(name = "words") String string) {
//        String result = string.toUpperCase();
//        return "Capitalize: " + result;
//    }
//
//    @GetMapping("/reverse")
//    public static String reverseSentence(@RequestParam(name = "sentence") String string) {
//        String[] word = string.split(" ");;
//        String[] result = new String[word.length];
//        int j = word.length-1;
//        for (int i = 0; i < word.length; i++) {
//            result[j] = word[i];
//            j--;
//        }
//        String str = String.join(" ", result);
//        return str;
//    }
//
//}
