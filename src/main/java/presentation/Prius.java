package presentation;

public class Prius extends Cars{
    public Prius(String carModel, double dragTime) {
        super(carModel, dragTime);
    }

    @Override
    public double getDragTime() {
        return super.getDragTime();
    }

    @Override
    public void setDragTime(double dragTime) {
        super.setDragTime(dragTime);
    }

    @Override
    public void quarterMileTime() {
        super.quarterMileTime();
    }
}
