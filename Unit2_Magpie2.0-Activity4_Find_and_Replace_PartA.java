private String transformIDislikeStatement(String statement)
   {
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals("."))
      {
            statement = statement.substring(0, statement.length() - 1);
      }

      int position = findPhrase (statement, "I dislike", 0);
      String object = statement.substring(position + 9);
      return "You said, '" + statement + "'? What do you dislike about " + object + "?";
   }