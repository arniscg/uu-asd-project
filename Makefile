build:
	javac src/OutcomeE.java -d ./build

run:
	java -classpath ./build src.OutcomeE

clean:
	rm -rf ./build