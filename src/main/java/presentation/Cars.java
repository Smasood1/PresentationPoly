package presentation;

public class Cars {

    private String carModel;
    private double dragTime;

    public Cars(String carModel,double dragTime ){
        this.dragTime = dragTime;
        this.carModel=carModel;


    }
    public double getDragTime() {
        return dragTime;
    }

    public void setDragTime(double dragTime) {
        this.dragTime = dragTime;
    }

    public void quarterMileTime(){

        System.out.println(carModel + " finished the quarter mile in " + getDragTime() + " seconds");
    }



}
