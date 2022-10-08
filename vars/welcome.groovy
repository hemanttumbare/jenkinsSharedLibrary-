def call (name){
  echo "Hey ${name}, welcome...!!!"
}

int readFileLineByLine( File file) {
    def line, noOfLines = 0;
    file.withReader { reader ->
        while ((line = reader.readLine()) != null) {
            println "${line}"
            noOfLines++
        }
    }
    return noOfLines
}
