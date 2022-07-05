package corejava;

import java.util.Date;
import java.util.stream.Stream;

public enum DaysOfTheWeek{
    SUNDAY("OFF"), MONDAY("WORKDAY"), TUESDAY("WORKDAY"), WEDNESDAY("WORKDAY"), THURSDAY("WORKDAY"), FRIDAY("WORKDAY"), SATURDAY("OFF");

    public String getTypeOfDay() {
        return typeOfDay;
    }

    private String typeOfDay;

    DaysOfTheWeek(String typeOfDay){
        this.typeOfDay = typeOfDay;
    }

    public static Stream<DaysOfTheWeek> stream(){
        return Stream.of(DaysOfTheWeek.values());
    }

}
