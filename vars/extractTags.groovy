Set readFileLineByLine(String str) {
  def textStr = str.split("\\r\\n|\\n|\\r");
   def listOfTags = [] as Set
   textStr.each { 
     // println it
      def s = it.toString() =~/(@[\w-]+)/
 while (s.find()) 
        // println s.group()   
     listOfTags.add(s.group())
   }
  println("tags : ")
  println ${listOfTags}
}
