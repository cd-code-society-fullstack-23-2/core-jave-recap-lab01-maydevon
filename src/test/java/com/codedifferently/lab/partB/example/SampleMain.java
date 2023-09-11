package com.codedifferently.lab.partB.example;

class SampleInterfaceObject implements  SampleInterface{

    @Override
    public String message() {
        return null;
    }
}

class SampleAbstractInstance extends SampleAbstractClass{

}

public class SampleMain {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass("Example");
        SampleInterfaceObject sampleInterface = new SampleInterfaceObject();
        SampleAbstractClass abstractClass = new SampleAbstractInstance();
    }
}
