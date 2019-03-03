package com.amy.company.restfulwebservices.HelloWorld;

public class HelloWorldBean {
    private String stringVar;

    public HelloWorldBean(String stringVar) {
        this.stringVar = stringVar;
    }

    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    public String getStringVar() {
        return stringVar;
    }

    //
    /*@Override
    public String toString() {
        return "HelloWorldBean{" +
                "stringVar='" + stringVar + '\'' +
                '}';
    }*/
}
