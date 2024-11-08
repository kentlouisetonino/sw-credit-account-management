compile:
	javac -d bin src/App.java

app:
	make compile
	java -cp bin src.App