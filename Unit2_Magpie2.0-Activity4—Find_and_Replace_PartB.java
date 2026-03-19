/*
You have to choose one statement of your own.
Please do not copy this word to word!

It is easy to make your own statement using this template
All that needs to be adjusted is int position and String object

your statement has to be Statement + object.
some examples are: I like apple (I like is the statement, apple is the object)
I don't like chemistry (I don't like is the statement and chemistry is the object)

int position, just change the middle parameter of findphrase to match your statement.
String object, just change the number in (position + number) to match the number of characters in your statement
then change the return to however you want.
*/
private String transformStatement(String statement)
   {
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals("."))
      {
            statement = statement.substring(0, statement.length() - 1);
      }

      int position = findPhrase (statement, "I think i like", 0);
      String object = statement.substring(position + 14).trim();
      return "That's interesting! What do you like about " + object + "? You should definitely go for them.";
   }