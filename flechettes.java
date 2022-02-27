import algorea.Scanner;
import static java.lang.Math.*;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbLettres = entrée.nextInt();
      for (int ligne = 1; ligne < 2 * nbLettres; ligne = ligne + 1)
      {
         for (int colonne = 1; colonne < 2 * nbLettres; colonne = colonne + 1)
         {
            int dist = distance(ligne,colonne,nbLettres,nbLettres);
            System.out.print( (char)('a' + nbLettres - dist - 1) );
         }
         System.out.println("");
      }
   }
   
   static int distance(int x1,int y1,int x2,int y2)
   {
      return max(abs(x1-x2),abs(y1-y2));
   }
}