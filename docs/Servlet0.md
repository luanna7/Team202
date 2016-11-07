# Restlet0
## Running the first Restlet app and try to debug it in eclipse-ee
1.  Windows -> Show View -> Servers add tomcat to eclipse
    Here we use tomcat v8.5

2.  new a dynamic web application project

3.  new a servlet file

4.  allow output folders for source folders (File -> properties -> java build path)

5.  right click the specified class file and run on server

6.  google app engine the same!

7.  if we want to run the code on Google app engine, we need to set the Run configuration Arguments - - port = our port and -startupUrl = localhost

## How to attach source or JavaDoc in eclipse for any jar file e.g. JavaFX
1.  Open the Build Path page of the project
2.  Open the Libraries tab
3.  Expand the node of the library in question (JavaFX)
4.  Select JavaDoc location and click edit
5.  Enter the location to the file which contains the Javadoc. Specifically for the javaFX javadoc enter 

## How to change the version of JDK
1.  /usr/libexec/java_home -V
2.  export JAVA_HOME=`/usr/libexec/java_home -v 1.6.0_65-b14-462`
3.  you can specify just the major version, if it's unique, like
4.  export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
5.  java -version you will see:
6.  java version "1.6.0_65"
    Java(TM) SE Runtime Environment (build 1.6.0_65-b14-462-11M4609)
    Java HotSpot(TM) 64-Bit Server VM (build 20.65-b04-462, mixed mode)
