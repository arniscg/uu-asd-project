build:
	javac src/PetSit.java -d ./build

run:
	java -classpath ./build src.PetSit

clean:
	rm -rf ./build