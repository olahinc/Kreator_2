public class Hero {
    private String name;
    private String clas;
    private int powerpoints;
    private int manapoints;
    private boolean newcharacter;

    Hero(String name, String clas, int powerpoints, int manapoints, boolean newcharacter) {
        this.name = name;
        this.clas = clas;
        this.powerpoints = powerpoints;
        this.manapoints = manapoints;
        this.newcharacter = newcharacter;
    }
    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String getClas() {
        return this.clas;
    }
    public String setClass(String clas) {
        this.clas = clas;
        return clas;
    }
    public int getPowerpoints() {
        return this.powerpoints;
    }
    public int setPowerpoints(int powerpoints) {
        this.powerpoints = powerpoints;
        return powerpoints;
    }
    public int getManapoints() {
        return this.manapoints;
    }
    public int setManapoints(int manapoints) {
        this.manapoints = manapoints;
        return manapoints;
    }
    public boolean getNewcharacter() {
        return this.newcharacter;
    }
    public boolean setNewcharacter(boolean newcharacter) {
        this.newcharacter = newcharacter;
        return newcharacter;
    }
    public int convert(int powerpoints, int manapoints){
        int impactForce=(powerpoints*manapoints)/2;
        return impactForce;
    }

}

