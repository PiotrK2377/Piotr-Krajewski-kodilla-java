package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()) {
            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double averageTemperature() {
        Double sum = 0.0;
        int i = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            i++;
        }
        return sum/i;

    }
    public Double medianTemperature() {
        Collection<Double> listValue = calculateForecast().values();
        List<Double> temperatureList = new ArrayList<Double>(listValue);

        Collections.sort(temperatureList);
        int median = temperatureList.size() / 2;
        if (temperatureList.size() % 2 == 0) {
            return (temperatureList.get(median) + temperatureList.get(median - 1)) / 2;
        }
        return temperatureList.get(median);
    }
}
