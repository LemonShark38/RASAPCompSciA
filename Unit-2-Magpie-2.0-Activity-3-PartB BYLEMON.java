//This is really easy.
private String transformIWantStatement(String statement)
{
	int pos = findPhrase(statement, "want", 0);
  String Obj = statement.substring(pos + 5, statement.length());
    
	return ("I would like " + Obj + ", too!");
}
