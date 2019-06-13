//package com.shrestha.code401springboot.firstWebApp;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class HelloWorldControllerTest {
//
//    @Test
//    public void testGetHelloWorld() {
//        HelloWorldController testGetHelloWorld = new HelloWorldController();
//        assertEquals("Checking if returns hello world",
//                "Hello, World!!!",
//            testGetHelloWorld.getHelloWorld());
//    }
//
//    @Test
//    public void testGetHelloToMe() {
//        HelloWorldController testGetHelloToMe = new HelloWorldController();
//        assertEquals("Checking if returns correctly",
//                "Hello there, Kush from Fumi",
//                testGetHelloToMe.getHelloToMe("Kush", "Fumi"));
//    }
//
//    @Test
//    public void testCapitalize() {
//        HelloWorldController testCapitalize = new HelloWorldController();
//        assertEquals("checking if word is capitalize",
//                "Capitalize: HELLO WORLD",
//                testCapitalize.capitalize("Hello World"));
//    }
//
//    @Test
//    public void testReverseSentence() {
//        HelloWorldController testReverseSentence = new HelloWorldController();
//        assertEquals("Checking if sentence is reversed",
//                "World Hello",
//                testReverseSentence.reverseSentence("Hello World"));
//    }
//
//}