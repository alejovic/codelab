package com.avg.demo.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsDemo {

    record Car(int id, String type, String make, String model, int engine){}

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car(1, "sedan", "BMW", "model1", 1200),
                new Car(2, "sedan", "Audi", "model2", 2300),
                new Car(3, "hatchback", "Skoda", "model3", 1200),
                new Car(3, "hatchback", "Audi", "model4", 1000),
                new Car(5, "hatchback", "Daihatsu", "model5", 2500)
        );
        cars.forEach(System.out::println);
        System.out.println("---\n");
        Consumer<Car> carConsumer = car -> System.out.println("consuming car: id" + car.id);
        cars.forEach(carConsumer);
        System.out.println("---\n");

        Predicate<Car> carPredicate = car -> car.type.equals("sedan");
        List<Car> filteredCars = cars.stream().filter(carPredicate).toList();
        System.out.println("filteredCars:" + filteredCars);
        System.out.println("---\n");

        Function<Car, String> carMakeFunction = car-> car.make;
        List<String> extractedCarMakeList = cars.stream().map(carMakeFunction).toList();
        System.out.println("extractedCarMakeList: " + extractedCarMakeList);
        System.out.println("---\n");

        // using function and map
        Function<Car, List<String>> carMakeAndModelFunction = car -> List.of(car.make, car.model);
        List<List<String>> extractedCarMakAndModelList = cars.stream().map(carMakeAndModelFunction).toList();
        extractedCarMakAndModelList.forEach(System.out::println);
        System.out.println("---\n");
        // using flatmap
        Function<Car, Stream<String>> carMakeAndModelFunctionFlat = car -> Stream.of(car.make, car.model);
        List<String> extractedCarMakAndModelListFlat = cars.stream().flatMap(carMakeAndModelFunctionFlat).toList();
        extractedCarMakAndModelListFlat.forEach(System.out::println);
        System.out.println("---\n");

        //when debugging...
        // 1
        Stream<Integer> integerStream = Stream.of(10,11,12,13,7);
        // 3
        Stream<Integer> filteredIntSream = integerStream.filter(integer -> integer % 2 != 0);
        // 2
        System.out.println("filteredIntSream: "+ filteredIntSream.count());
        System.out.println("---\n");

        // partition
        Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(Collectors.partitioningBy(carPredicate));
        System.out.println("partitionedCars: " + partitionedCars.get(Boolean.TRUE));
        System.out.println("---\n");

        // type, map(make, engine)
        Map<String, Map<String,Integer>> groupedCars = cars.stream().collect(
                Collectors.groupingBy(
                car -> car.type,
                    Collectors.toMap(car -> car.make, car-> car.engine)
                )
        );
        System.out.println("groupedCars: " + groupedCars);

        System.out.println("---\n");

    }
}
