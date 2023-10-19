package Functional_exercises;

import java.util.List;
import java.util.stream.Collectors;

//public class Main {
   // public static void main(String[] args) {
        // Assuming you have a list of Vehicle objects named marutiVehicles
        //List<Vehicle> marutiVehicles = vehicleRepo.findByMake("MARUTI");

        // Extract all regNo values from marutiVehicles list using stream operator
      //  List<String> regNos = marutiVehicles.stream()
       //         .map(Vehicle::getRegNo)
        //        .collect(Collectors.toList());

      //  System.out.println("All regNo values from marutiVehicles: " + regNos);
    //}
//}

class Vehicle {
    String regNo;
    String engineNo;
    String chasissNo;
    Integer regYear;
    Float price;
    String model;

    public String getRegNo() {
        return regNo;
    }
}

