import algorea.Scanner;
import static java.lang.Math.*;
class Main
{
   static int nbValeurs;
   static double[] valeurs;
   static double seuil;
   
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      nbValeurs = entrée.nextInt();
      seuil = entrée.nextDouble();
      double[] temp = new double[nbValeurs];
      valeurs = new double[nbValeurs];
      for (int position = 0; position < nbValeurs; position = position + 1)
      {
         valeurs[position] = entrée.nextDouble();
      }
      
      int nbTours = 0;
      while ( !lisse() )
      {
         nbTours = nbTours + 1;
         for (int position = 1; position < nbValeurs - 1; position = position + 1)
         {
            temp[position] = (valeurs[position - 1] + valeurs[position + 1]) / 2;
         }
         for (int position = 1; position < nbValeurs - 1; position = position + 1)
         {
            valeurs[position] = temp[position];
         }
      }
            
      System.out.println(nbTours);
   }
   
   static boolean lisse()
   {
      for (int position = 1; position < nbValeurs; position = position + 1)
      {
         if (abs( valeurs[position] - valeurs[position - 1] ) > seuil)
         {
            return false;
         }
      }
      return true;
   }
}