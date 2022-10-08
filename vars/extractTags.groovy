def readFileLineByLine(String str) {
   textStr = str.split("\\r\\n|\\n|\\r");
   textStr.each { 
     // println it
        s = it.toString() =~/(@[\w-]+)/
 while (s.find()) 
         println s.group()      
   }
 
 }
