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
    public static String transformIWantStatement(String statement)
    {
        int idx_IWant = findPhrase(statement, "I Want", 0);
        String starter_IWant = "I would like";
        String end_IWant = ", too!";
        String IWouldLike = statement.substring(idx_IWant + 6, statement.length());
        
        String final_str = starter_IWant + IWouldLike + end_IWant;
        
        return final_str;
    }
    
    public static void main(String[] args) 
    {
        System.out.print(transformIWantStatement("I want cookies"));
    }
}