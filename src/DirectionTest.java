import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Direction[] direction = Direction.values();

        for (int i = 0; i<direction.length; i++){
            System.out.println(direction[i]);
        }

        System.out.println("Gdzie chcesz sie udac? ");
        String myDirection = scan.nextLine();

        Direction myDirect = Direction.valueOf(myDirection);

        System.out.println("A wiec idziemy na " + myDirect.getNameDirection());

        System.out.println("Podaj numer kierunku: ");
        int number = scan.nextInt();
        System.out.println("Chcesz isc na " + convert(number));

    }

    public static String convert(int num){
        String numberToString;
        Direction directionNumber;
        if (num == Direction.NORTH.ordinal()){
            directionNumber = Direction.NORTH;
            numberToString = directionNumber.getNameDirection();
        } else if(num == Direction.EAST.ordinal()){
            directionNumber = Direction.EAST;
            numberToString = directionNumber.getNameDirection();
        } else if(num == Direction.SOUTH.ordinal()){
            directionNumber = Direction.SOUTH;
            numberToString = directionNumber.getNameDirection();
        } else if(num == Direction.WEST.ordinal()){
            directionNumber = Direction.WEST;
            numberToString = directionNumber.getNameDirection();
        } else {
            directionNumber = Direction.UNDEFINED;
            numberToString = directionNumber.getNameDirection();
        }
        return numberToString;
    }

}