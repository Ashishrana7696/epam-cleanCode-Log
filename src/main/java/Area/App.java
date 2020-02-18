package Area;
import java.util.*;
public class App
{
    private static Scanner in=new Scanner(System.in);

    public enum Standards {
        standardMaterials,
        mediumStandardMaterials,
        highStandardMaterials;
    }
    public static void main( String[] args )
    {
        double area;
        String material;
        boolean automation = false;

        System.out.println("Enter the Area : ");
        area = in.nextDouble();
        System.out.println("Choose material Type: ");
        material = getMaterialType();

        if(material.toLowerCase().equals(Standards.highStandardMaterials.toString().toLowerCase())){
            System.out.println("Select automation (true/false) : ");
            automation = in.nextBoolean();
        }

        CalculateInterest calculateInterest = new CalculateInterest();
       if(calculateInterest.getInterest(area,material,automation)<0)
       {
           System.out.println("Invalid option");
       }
       else{
            System.out.println(calculateInterest.getInterest(area,material,automation));
      }
    }

    private static String getMaterialType(){
        Standards[] standards = Standards.values();
        for(int i=0;i<3;i++){
            System.out.println("Type '" + standards[i] + "' for " + standards[i]);
        }
        System.out.println("Input : ");
        String material = in.next();

        return material;
    }
}
