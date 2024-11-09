remove:
	rm -rf bin

compile:
	javac -d bin src/App.java

app:
	make remove
	make compile
	java -cp bin src.App