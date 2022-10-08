def readFileLineByLine(String str) {
   // String textStr[] = str.split("\\r\\n|\\n|\\r");
  s = str=~ /(@[\w-]+)/
  while (s.find()) 
          println s.group()
 }
