import algorea.Scanner;
class Main
{
   public static void main (String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbGrenouilles = entrée.nextInt();
      int nbTours = entrée.nextInt();
      int[] positions = new int[nbGrenouilles + 1];
      int[] nbToursEnTête = new int[nbGrenouilles + 1];
      for (int grenouille = 1; grenouille <= nbGrenouilles; grenouille = grenouille + 1)
      {
         positions[nbGrenouilles] = 0;
         nbToursEnTête[nbGrenouilles] = 0;
      }
      int maximum = 0;
      int grenouilleEnTête = 0;
      
      for (int tour = 2; tour <= nbTours; tour = tour + 1)
      {
         int grenouille = entrée.nextInt();
         int bond = entrée.nextInt();
         positions[grenouille] = positions[grenouille] + bond;
         if (positions[grenouille] > maximum)
         {
            nbToursEnTête[grenouille] = nbToursEnTête[grenouille] + 1;
            maximum = positions[grenouille];
            grenouilleEnTête = grenouille;
         }
         else if (positions[grenouille] == maximum)
         {
            grenouilleEnTête = 0;
         }
         nbToursEnTête[grenouilleEnTête] = nbToursEnTête[grenouilleEnTête] + 1;
      }
      
      int grenouilleGagnante = 1;
      int nbToursGagnante = 0;
      for (int grenouille = 1; grenouille <= nbGrenouilles; grenouille = grenouille + 1)
      {
         if (nbToursGagnante < nbToursEnTête[grenouille])
         {
            nbToursGagnante = nbToursEnTête[grenouille];
            grenouilleGagnante = grenouille;
         }
      }
      
      System.out.println(grenouilleGagnante);
   }
}