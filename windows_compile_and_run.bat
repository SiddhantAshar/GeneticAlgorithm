dir *.java /s /b > tmp.txt
javac @tmp.txt -d bin
del tmp.txt
java -classpath bin\ GAMain.Main
