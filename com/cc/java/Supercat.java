package com.cc.java;

public class Supercat {
    private String name;
    private String furColor;
    protected int age;




protected String getStringAttributes(String flag) {
    switch (flag) {
        case "#name":
            return name;
        case "#color":
            return furColor;
        default:
            return "#!ERROR";
            }
        }
    
      

}
