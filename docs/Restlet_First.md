# Google App Engine Summary 0
## 1 Use Cloud Shell to clone and navigate to the "Hello World" code. The sample code is cloned from your project repository to the Cloud Shell.

gcloud config set project database-default \
  && gcloud source repos clone java-gae-quickstart \
    ~/src/database-default/java_gae_quickstart-2016-11-05-00-14  \
  && cd ~/src/database-default/java_gae_quickstart-2016-11-05-00-14 \
  && git checkout gcloud

pwd:
~/src/database-default/java_gae_quickstart-2016-11-05-00-14

## 2 Cloud Shell lets you test your app before deploying to make sure it's running as intended, just like debugging on your local machine.

To test your app enter:
mvn gcloud:run

Your app is now running on Cloud Shell. You can access the app by using "Web preview"  to connect to port 8080. show me how
on the bottom of left side.

## 3 Terminate the instance of the application by pressing Ctrl+C in the Cloud Shell.

## 4 Deploying with Cloud Shell
You can use Cloud Shell to deploy your app. To deploy your app enter:
mvn gcloud:deploy

## 5 Congratulations! Your app has been deployed. The default URL of your app is database-default.appspot.com 

## 6 You can check in on your app by monitoring its status on the App Engine dashboard.

Open the menu on the left side of the console and select App Engine.

# How to install google cloud sdk on mac:
https://cloud.google.com/sdk/docs/quickstart-mac-os-x

# Running the first Restlet app and try to debug it in eclipse-ee
1. Windows -> Show View -> Servers add tomcat to eclipse
Here we use tomcat v8.5

2. new a dynamic web application project

3. new a servlet file

4. allow output folders for source folders (File -> properties -> java build path)

5. right click the specified class file and run on server

6. google app engine the same!

7. if we want to run the code on Google app engine, we need to set the Run configuration Arguments - - port = our port and -startupUrl = localhost


# How to change the version of JDK
1. /usr/libexec/java_home -V
2. export JAVA_HOME=`/usr/libexec/java_home -v 1.6.0_65-b14-462`
3. you can specify just the major version, if it's unique, like
4. export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
5. java -version you will see:
6. java version "1.6.0_65"
   Java(TM) SE Runtime Environment (build 1.6.0_65-b14-462-11M4609)
   Java HotSpot(TM) 64-Bit Server VM (build 20.65-b04-462, mixed mode)


# How to attach source or JavaDoc in eclipse for any jar file e.g. JavaFX
1. Open the Build Path page of the project
2. Open the Libraries tab
3. Expand the node of the library in question (JavaFX)
4. Select JavaDoc location and click edit
5. Enter the location to the file which contains the Javadoc. Specifically for the javaFX javadoc enter 


# How to config eclipse javadoc such as javax.servlet api
1. Since you're using Tomcat, you need to download the Tomcat Source Code Distribution. Here is the Tomcat 6.0.32 source. 
2. Once downloaded, open a random Servlet API or Tomcat API specific file, e.g. Ctrl+Click or Ctrl+Shift+T HttpServlet, then click Attach source, then locate the zip file you just downloaded.That's it.

or
In Package Explorer of your project go to Java Resources > Libraries. Rightclick servlet-api.jar, choose Properties and specify the source location there (the apache-tomcat-x.x.x-src.zip file).

Another way is to just open any Servlet API class using Ctrl+Shift+T or by Ctrl+Click on any import/declaration in existing code and then click the Attach Source... button and specify it there.

SoapUI Pro 5.1.2 hangs on Mac OS X 10.8.5
The steps on http://www.bencode.net/blog/2015/01/25/soapui-freezing-osx/ worked for me (on OS X 10.10.3):
 
Start ‘Activity Monitor’ and Force Kill your dead soapUI process. [Or use Command-Option-Escape to force quit it.]
In Finder, /Applications/SmartBear/soapUI-5.0.0.app > Show Package Contents.
Edit /Applications/SmartBear/soapUI-5.0.0.app/Contents/java/app/bin/soapui.sh.
Uncomment this line# JAVA_OPTS="$JAVA_OPTS -Dsoapui.browser.disabled=true". [In other words, remove the "#" to stop it being a comment.]
Edit /Applications/SmartBear/soapUI-5.0.0.app/Contents/vmoptions.txt.
Add -Dsoapui.browser.disabled=true.
Start soapUI.
[In those paths, change soapUI-5.0.0 to match your version. For me it is soapUI-5.1.3.]
Hope this helps.

# How to transfer input Stream to Json 
http://stackoverflow.com/questions/3831680/httpservletrequest-get-json-post-data

# How to add doGet or doPost methods to the code?

1. right click the blank in eclipse
2. source—> extends and implements

# How to parse xmlString in Servlet:
https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm

# How to Read/convert an InputStream to a String
http://stackoverflow.com/questions/309424/read-convert-an-inputstream-to-a-string

# How to Get Posted XML from HttpServletRequest Object
http://stackoverflow.com/questions/5453649/get-posted-xml-from-httpservletrequest-object

# How to use normal patterns in String
https://www.tutorialspoint.com/java/java_regular_expressions.htm
