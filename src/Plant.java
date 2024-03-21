public class Plant {
    private String name;
    private String latinName;
    private boolean isItAnnual;
    private String continentOnWhereItGrows;
    private int height;
    private String isItEdible;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setLatinNameName(String latinName) {
        this.latinName = latinName;
    }

    public String getLatinName(String latinName) {
        return this.latinName;
    }

    public void setIsItAnnual(Boolean isItAnnual) {
        this.isItAnnual = isItAnnual;
    }

    public boolean getIsItAnnual(boolean isItAnnual) {
        return this.isItAnnual;
    }

    public void setContinentOnWhereItGrows(String continentOnWhereItGrows) {
        this.continentOnWhereItGrows = continentOnWhereItGrows;
    }

    public String getContinentOnWhereItGrows(String continentOnWhereItGrows) {
        return this.continentOnWhereItGrows;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(int height) {
        return this.height;
    }

    public void setIsItEdible(String isItEdible) {
        this.isItEdible = isItEdible;
    }

    public String getIsItEdible(String isItEdible) {
        return this.isItEdible;
    }

    public Plant() {}

    public Plant(String name, String latinName, boolean isItAnnual, String continentOnWhereItGrows, int height, String isItEdible) {
        this.name = name;
        this.latinName = latinName;
        this.isItAnnual = isItAnnual;
        this.continentOnWhereItGrows = continentOnWhereItGrows;
        this.height = height;
        this.isItEdible = isItEdible;
    }
}
