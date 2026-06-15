# Setup of basic gradle using CLI

```
gradle init
```
The above command will setup a basic gradle project
```
.\gradlew jar 
```
Used for creating a  new jar of the project in build/libs
make sure to setup manifest property in the build.gradle folder
```
java -jar fileName.jar
```
Used to execute the jar folder

```jar {
    manifest {
        attributes(
                'Main-Class': 'org.example.Main'
        )
    }
}
```
This is a example of manifests written inside build.gradle file
Purpose: to identify the entry point