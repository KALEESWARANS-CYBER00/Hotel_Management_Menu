import java.util.Scanner;

public class main {
    public static String rice[] = { "White Rice", "Tomato Rice ", "Lemon Rice ", "Ghee Rice", "Egg Rice" };
    public static String wheat[] = { "Chapatti", "puri   " };
    public static String Maitha[] = { "Parotta", "Naan   " };
    public static int size_Maitha1 = Maitha.length;
    public static int size_wheat1 = wheat.length;
    public static int size_rice = rice.length;
    public static int rice_prize[] = { 80, 40, 40, 50, 50 };
    public static int size_rprize = rice.length;
    public static int wheat_prize[] = { 80, 40, 40, 50 };
    public static int wheat_rprize = wheat.length;
    public static int Maitha_prize[] = { 80, 40, 40, 50 };
    public static int Maitha_rprize = Maitha.length;

    static void rice(String rice[], int size_rice) {

        System.out.println("\n\nRice Item:");
        for (int i = 0; i < size_rice; i++) {
            System.out.println(i + 1 + "." + rice[i]);
        }
    }

    static void wheat(String wheat[], int size_wheat1) {

        System.out.println("\n\nWheat Item:");
        for (int i = 0; i < size_wheat1; i++) {
            System.out.println(i + 1 + "." + wheat[i]);
        }

    }

    static void Maitha(String Maitha[], int size_Maitha1) {

        System.out.println("\n\nMaitha Item:");
        for (int i = 0; i < size_Maitha1; i++) {
            System.out.println(i + 1 + "." + Maitha[i]);
        }
    }

    static void get_Rice(String rice[], int size_rice, int rice_prize[]) {
        System.out.println("***********RICE ITEM*********************");
        System.out.println("*****************************************\n");
        for (int i = 0; i < size_rice; i++) {
            System.out.println(i + 1 + "." + rice[i] + "\t-->\t" + rice_prize[i] + ".Rs");
        }
    }

    static void get_Wheat(String w[], int size_wheat1, int wheat_prize[]) {
        System.out.println("***********WHEAT ITEM*********************");
        System.out.println("*****************************************\n");
        for (int i = 0; i < size_wheat1; i++) {
            System.out.println(i + 1 + "." + wheat[i] + "\t-->\t" + wheat_prize[i] + ".Rs");
        }

    }

    static void get_maitha(String m[], int size_Maitha1, int Maitha_prize[]) {
        System.out.println("***********MAITHA ITEM*********************");
        System.out.println("*****************************************\n");
        for (int i = 0; i < size_Maitha1; i++) {
            System.out.println(i + 1 + "." + Maitha[i] + "\t-->\t" + Maitha_prize[i] + ".Rs");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n--------------------HOTEL NAME--------------------------");
        System.out.println("------------------------------------- phone no:123456789");
        System.out.println("---------------------MENU-------------------------------");

        rice(rice, size_rice);
        wheat(wheat, size_wheat1);
        Maitha(Maitha, size_Maitha1);
        System.out.println("\n\n");
        System.out.print("PLEASE SELECT A ITEM (Rice,Wheat,Maitha):");
        String input1 = sc.nextLine();
        switch (input1) {
            case "Rice":
                get_Rice(rice, size_rice, rice_prize);
                break;
            case "Wheat":
                get_Wheat(args, size_wheat1, wheat_prize);
                break;
            case "Maitha":
                get_maitha(args, size_Maitha1, Maitha_prize);
                break;
            default:
                break;
        }

    }
}