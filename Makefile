remove:
	rm -rf bin

compile:
	javac -d bin src/App.java

run:
	make remove
	make compile
	java -cp bin src.App
