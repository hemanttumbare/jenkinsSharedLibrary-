def readFileLineByLine(String str) {
   textStr = str.split("\\r\\n|\\n|\\r");
   textStr.each { 
         s = it =~ /(@[\w-]+)/
  while (s.find()) 
          println s.group()      
   }
 
 }
