import algorea.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      String partitionOriginale = entrée.next();
      int nbNotes = partitionOriginale.length();
      char[] partition = new char[nbNotes];
      partitionOriginale.getChars(0,nbNotes,partition,0);
      int longueur = 0;
      for (int position = 0; position < nbNotes; position = position + 1)
      {
         if ((longueur > 0) && (partition[longueur - 1] == partition[position]))
         {
            longueur = longueur - 1;
         }
         else
         {
            partition[longueur] = partition[position];
            longueur = longueur + 1;
         }
      }
      System.out.println(new String(partition,0,longueur));
   }
}