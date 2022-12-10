javac -d bin/ $(find . -type f -name "*.java")
java -classpath bin/ GAMain.Main