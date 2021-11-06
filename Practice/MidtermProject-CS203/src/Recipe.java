public  class Recipe implements Cloneable{
    private String recipeName;
    private String ingredients;
    private String instructions;
    private int prepTime;
    private int cookingTime;
    private int serving;

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

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
