public  final class Recipe {
    private final String recipeName;
    private  final String ingredients;
    private final String instructions;
    private final int prepTime;
    private final int cookingTime;
    private final int serving;

    public Recipe() {
        this.recipeName = "unknown";
        this.ingredients = "unknown1,unknown2,unknown3";
        this.instructions = "instruction here";
        this.prepTime = 0;
        this.cookingTime = 0;
        this.serving = 0;

    }

    public Recipe(String recipeName, String ingredients, String instructions, int prepTime, int cookingTime, int serving) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookingTime = cookingTime;
        this.serving = serving;
    }



    public String getRecipeName() {
        return recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getPrepTime() {
        return prepTime;
    }



    public int getCookingTime() {
        return cookingTime;
    }


    public int getServing() {
        return serving;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", instructions='" + instructions + '\'' +
                ", prepTime=" + prepTime +
                ", cookingTime=" + cookingTime +
                ", serving=" + serving +
                '}';
    }



}
