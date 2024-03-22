public class Plant {
    private String name;
    private String latinName;
    private boolean isItAnnual;
    private String continentOnWhereItGrows;
    private double height;
    private boolean isItEdible;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLatinNameName(String latinName) {
        this.latinName = latinName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void setIsItAnnual(Boolean isItAnnual) {
        this.isItAnnual = isItAnnual;
    }

    public boolean getIsItAnnual() {
        return this.isItAnnual;
    }

    public void setContinentOnWhereItGrows(String continentOnWhereItGrows) {
        this.continentOnWhereItGrows = continentOnWhereItGrows;
    }

    public String getContinentOnWhereItGrows() {
        return this.continentOnWhereItGrows;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setIsItEdible(boolean isItEdible) {
        this.isItEdible = isItEdible;
    }

    public boolean getIsItEdible() {
        return this.isItEdible;
    }

    public Plant() {}

    public Plant(String name, String latinName, boolean isItAnnual, String continentOnWhereItGrows, double height, boolean isItEdible) {
        this.name = name;
        this.latinName = latinName;
        this.isItAnnual = isItAnnual;
        this.continentOnWhereItGrows = continentOnWhereItGrows;
        this.height = height;
        this.isItEdible = isItEdible;
    }


        @Override
          public String toString() {
            return this.name + " " +
                   this.latinName + " " +
                    (this.isItAnnual ? "vienmetis" : "daugiametis" )  + " " +
                   this.continentOnWhereItGrows  + " " +
                   this.height + " m. " +
                    (this.isItEdible ? "" : "ne") + "valgomas";
        }

}
