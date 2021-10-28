package Question10.myutil;

public class MealCard {
    private final int DEFAULT_POINT = 100;
    private int points;
    private String stdName;
    private int foodQuatity ;

    public MealCard(){
        stdName = "Unknown";
        points = DEFAULT_POINT;
    }
    public MealCard(String stdName, int points){
        this.points = points;
        this.stdName = stdName;

    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getFoodQuatity() {
        return foodQuatity;
    }

    public void setFoodQuatity(int foodQuatity) {
        this.foodQuatity = foodQuatity;
    }

    public void foodPuchase(int numberOfItems){
        if((this.points - numberOfItems)<0) System.out.println("Not enough points");
        else
            this.points -= numberOfItems;
    }
    public void pointPuchase(int numberOfPoints){

            this.points += numberOfPoints;
    }

    @Override
    public String toString(){
        return "Students: " + this.stdName+ "\npoints: " +this.points;
    }
}
