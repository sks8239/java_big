package 클래스정렬예제1번;

public class CarSort implements Comparable<CarSort>{
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear){
            return this.modelName.compareTo(o.modelName);
        }
        return this.modelYear- o.modelYear; // 양수라면 정렬(오름차순 정렬)
    }
}
