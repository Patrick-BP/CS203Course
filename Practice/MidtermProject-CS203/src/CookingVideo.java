import javax.sound.midi.Soundbank;

public class CookingVideo extends Video implements CookingVideos{
    private Recipe recipe;

    public CookingVideo() {
        super();
        this.recipe = new Recipe();
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String[] getIngredientList() {
        String str = recipe.getIngredients();
        String[] Str2 = str.split(",");
        return Str2;
    }

    @Override
    public Recipe getCookingRecipe() {
        return recipe;
    }

    @Override
    public void printRecipe() {
        String[] x = getIngredientList();
        String y = "";
        for (String e: x) {
            y += e+" ,";
        }
        System.out.println("Dish: "+ recipe.getRecipeName() + "\nIngredients:  " + y  + "\nDirection: " + recipe.getInstructions()+ "\nPreptime: " +
                recipe.getPrepTime() + "\ncookingTime: " + recipe.getCookingTime()+ "\nserving: " + recipe.getServing() );
    }

    @Override
    public String toString() {
        return "CookingVideo{" + super.toString()+
                "recipe=" + recipe +
                '}';
    }
}
