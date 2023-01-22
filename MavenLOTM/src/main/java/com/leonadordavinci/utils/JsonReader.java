package com.leonadordavinci.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonadordavinci.Car.Car;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class JsonReader {
    public void jacksonMethod(String SealedName) throws IOException, ParseException {

        ObjectMapper objectMapper = new ObjectMapper();

        InputStream json = this.getClass().getClassLoader().getResourceAsStream("SealedBasicInfo/" + SealedName + ".json");

        //System.out.println(json);

        //Car car = objectMapper.readValue(json, Car.class);

        //String carJson ="{ \"name\" : \"变异的太阳\", \"official\" : true }";



        try {
            Car car = objectMapper.readValue(json, Car.class);

            System.out.println("car name = " + car.getName());
            System.out.println("car offcial = " + car.getOfficial());
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
