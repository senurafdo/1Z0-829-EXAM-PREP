## Building Blocks 
### How to compile java files from different packages

#### compile java files 
javac packageName/className.java - this will compile only one class

#### compiling with wildcards 
javac packageName/*.java  - to compile all the java classes within the packageName
javac package01/*.java package02/*.java -  to compile all the java classes within the package01 and package02 

### How to compile java file with .java to a dedicated location [ -d ]
after -d path for the .class files 
 
 javac -d classes packagea/*.java packageb/*.java

### How to run by specifying java classpath [-cp , -classpath, --class-path]

when compiling it's not required to compile from the root directory.
but when running the compiled class file its requied to run from the root directory.



java -cp buildingBlocks/packages/classes  buildingBlocks/packages/packageb/ClassB 

java -classpath buildingBlocks/packages/classes  buildingBlocks/packages/packageb/ClassB

java --class-path buildingBlocks/packages/classes  buildingBlocks/packages/packageb/ClassB

java --class-path buildingBlocks/packages/classes  buildingBlocks.packages.packageb.ClassB

## Lambdas and Functional Interfaces

lambdas work only with interfaces only with one abstract method 

