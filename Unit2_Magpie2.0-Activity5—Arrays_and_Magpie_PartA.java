private String getRandomResponse()
{
   final int NUMBER_OF_RESPONSES = 6;
   int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
   String[] responses = 
   {
      "Interesting.",
      "Okay.",
      "I haven't heard that before.",
      "What else could you tell me about that?",
      "Where did you hear that?",
      "Please, go on."
   };
         
   return responses[whichResponse];
}