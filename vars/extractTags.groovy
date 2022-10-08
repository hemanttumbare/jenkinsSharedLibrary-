def readFileLineByLine(String str) {
  def textStr = str.split("\\r\\n|\\n|\\r");
   textStr.each { 
     // println it
      def s = it.toString() =~/(@[\w-]+)/
 while (s.find()) 
         println s.group()      
   }
 
 }
