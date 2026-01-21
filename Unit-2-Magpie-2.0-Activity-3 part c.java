class Main 
{
    public static int findPhrase(String statement, String goal, int startPos)
    {
       String phrase = statement.trim().toLowerCase();
       goal = goal.toLowerCase();

       // The only change to incorporate the startPos is in
       // the line below
       int position = phrase.indexOf(goal, startPos);

       // Refinement--make sure the goal isn't part of a
       // word
       while (position >= 0)
       {
          // Find the string of length 1 before and after
          // the word
          String before = " ", after = " ";
          if (position > 0)
          {
             before = phrase.substring(position - 1, position);
          }
          if (position + goal.length() < phrase.length())
          {
             after = phrase.substring(position + goal.length(), position + goal.length() + 1);
          }

          // If before and after aren't letters, we've
          // found the word
          if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a letter
              && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
          {
             return position;
          }

          // The last position didn't work, so let's find
          // the next, if there is one.
          position = phrase.indexOf(goal, position + 1);
       }
       return -1;
    }

    // This is the code you looking for part b
    private static String transformWouldYouLikeStatement(String statement)
    {
      int idx_You = findPhrase(statement, "You Like", 0);
      int idx_toXwith = findPhrase(statement, "like to", idx_You);

      String youlike = statement.substring(idx_You, idx_You + 8);
      String towalk = statement.substring(idx_toXwith + 7, statement.length() - 3);
      String starter = "When would ";
      String ending = "you?";

      String final_str = starter + youlike + " me to" + towalk + ending;
      return final_str;
    }    
    public static void main(String[] args) 
    {
        System.out.print(transformWouldYouLikeStatement("Would you like to walk with me?"));
    }
}