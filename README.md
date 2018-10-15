# Budget Buddy 

## Installation and Setup
### Required Software
* [Java Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Apache Tomcat](https://tomcat.apache.org/download-90.cgi) (Preferred latest version 9.0.x)
   - Note: Be sure to install Tomcat as a service
* [Eclipse IDE for Java EE Developers](https://www.eclipse.org/downloads/packages/)

### Connecting Tomcat to Eclipse
1. After installing all of the above required software, **open Eclipse**.
2. When in the Java EE perspective, under the servers tab at the bottom you should see a link that says '*No servers are available. Click this link to create a new server...*'
   - **Click that link**
3. Under server type, expand the Apache folder and **select Tomcat v9.0 Server**
   - Leave the rest of the options on the page as is and **click Next**
4. You will now be prompted to configure the Tomcat installation. Under installation directory, **browse to and select** the folder you installed Tomcat into
   - If you left the defaults when installing Tomcat, on Windows x64 the path will be: *C:\Program Files\Apache Software Foundation\Tomcat 9.0*
   - Leave the rest of the options as their defaults and **click Finish**
5. You should now see *Tomcat v9.0 Server at localhost* as an option in the Servers tab

### Project Setup
1. **Clone** this project to your machine in a directory separate from your eclipse workspace.
   - Example: C:\dev\ or C:\Projects\
2. In Eclipse, **click File > Import...**
3. **Expand the Maven folder** and **select Existing Maven Projects**
   - **Click Next**
4. **Browse to and select the root folder** where you cloned this project to
   - Example: C:\dev\BudgetBuddy
5. **Click Finish** and wait for Maven to build the workspace.
6. **Right click** the project in the Project Explorer and **select Run As > Run on Server**
7. When prompted for the server to use, make sure **Tomcat v9.0 Server at localhost is selected**
8. Optionally click the checkbox that says *Always use this server when running this project*
9. **Click Finish**
10. If everything went well, you should see a web browser open to the root of the project and "Hello World!" should be displayed.
