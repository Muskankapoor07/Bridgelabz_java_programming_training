package com.hotel.io;

import com.hotel.model.Room;
import com.hotel.validation.RoomValidator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<Room> readRooms(String filePath) {

        List<Room> rooms = new ArrayList<>();
        RoomValidator validator = new RoomValidator();

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(filePath))) {

            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Room room = new Room(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        Boolean.parseBoolean(data[3])
                );


                if (validator.validate(room).isEmpty()) {

                    rooms.add(room);

                } else {

                    System.out.println(
                            "Invalid Room : " + room);
                }
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return rooms;
    }
}