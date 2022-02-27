import algorea.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbLivres = entrée.nextInt();
      int nbJours = entrée.nextInt();
      int[] dateRetour = new int[nbLivres];
      for (int livre = 0; livre < nbLivres; livre = livre + 1)
      {
         dateRetour[livre] = 0;
      }
      for (int jour = 0; jour < nbJours; jour = jour + 1)
      {
         int nbClients = entrée.nextInt();
         for (int loop = 1; loop <= nbClients; loop = loop + 1)
         {
            int livre = entrée.nextInt();
            int durée = entrée.nextInt();
            if (dateRetour[livre] > jour)
            {
               System.out.println("0");
            }
            else
            {
               System.out.println("1");
               dateRetour[livre] = jour + durée;
            }
         }
      }
   }
}