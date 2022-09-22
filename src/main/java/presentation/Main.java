package presentation;

//create multiple cars with a polymorphic method
//getters and setters for drag race times


public class Main {
    //create objects
    public static void main(String[] args) {
     //   Cars myCar = new Cars();

       // myCar.setDragTime(15.0);

      //  System.out.println(myCar.getDragTime());

        Gtr myGtr = new Gtr("Godzilla",4.5);


        myGtr.quarterMileTime();

        Prius myPrius = new Prius("The Silent Killer",1.52);

        myPrius.quarterMileTime();

        Hurrican myLambo = new Hurrican("Hurrican Performante",3.2);

        myLambo.quarterMileTime();

        myLambo.setDragTime(2.1);

        myLambo.quarterMileTime();

    }





}
