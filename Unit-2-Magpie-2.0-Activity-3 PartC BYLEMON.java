//well, this is just one line longer than the last :P
private String transformWouldYouLikeStatement(String statement)
{
	int pos = findPhrase(statement, "like to", 0);
    int endpos = findPhrase(statement, "with", pos) - 1;
  	String Obj = statement.substring(pos + 7, endpos);
    
	return ("When would you like me to" + Obj + " with you?");
}
