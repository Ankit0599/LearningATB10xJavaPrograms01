package ex_019_OOPS_Constructor;

public class Car2 {
    String name;
    String model;
    int year;

    //Default Constructor
    Car2 (){
        name = "XXX";
        model = "DFG";
        year = 1900;

    }

    //Parameterized Constructor
        Car2(String car_name, String model_name, int year_created) {
            this.name = car_name;
            this.model = model_name;
            this.year = year_created;


    }
}
