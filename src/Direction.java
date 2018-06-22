public enum Direction {
    NORTH ("Polnoc"),
    EAST ("Wschod"),
    SOUTH ("Południe"),
    WEST ("Zachod"),
    UNDEFINED ("Nie mozna isc w podanym kierunku!");

    private final String nameDirection;

    private Direction(String nameDirection){
        this.nameDirection=nameDirection;
    }

    public String getNameDirection() {
        return nameDirection;
    }


}