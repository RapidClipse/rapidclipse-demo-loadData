# Rapidclipse Demo: Do something with blobs

This demo project shows a example how to work with files that are saved in a database as blobs.

### Basic information
	
In a database, files like images or PDFs mostly are saved as a Blobs, as a bunch of bytes. 
The default java datatype for blobs is a bytearray (```byte[]```).

To work with this byte arrays, the first step is to convert them into a stream. 

There are mainly two type of Streams: 
```InputStreams``` provide content, you can *READ* from them.
```OutputStreams``` are for *WRITING* something to them.

There are variants of each of them, so for example there are ```FileInputStream```s, ```ByteArrayInputStream```s and so on, depending on the source - or for OutputStreams on the target.

### RapidClipse related information 

To display a image or send a PDF to a browser frame or as download to the user a ```Resource``` is necessary.

One possible way is to use a Stream as a way to get a ```Resource``` from the byte array.
And as we have a *byte array* and want to *read* the content, we need a ```ByteArrayInputStream```.
So the line of action contains of these conversions:
```byte[] -> Stream -> Resource```


### Get the Projekt running 
1. Clone the GIT Repository or use the import function of RapidClipse
2. File -> Import -> RapidClipse -> Demo Projects -> "rapidclipse-demo-loadData"
3. Maybe do some Maven updates to remove project errors 
4. Create a additional Table in the Northwind database. See "Important project configuration" below!
4. Start the Project

### Important project configuration
1. Connect to your H2 Northwind database in the ["Data Source Explorer"](https://rapidclipse.atlassian.net/wiki/display/DOCEN/Data+Source+Explorer) view in RapidClipse.
2. Open the schemaBlobstore.ddl file and export the script to your H2 Northwind database. The DDL file is located under "\rapidclipse-demo-loadData\WebContent\WEB-INF\resources\schemaBlobstore.ddl" in the workspace folder. See ["Run DDL scripts"](https://rapidclipse.atlassian.net/wiki/pages/viewpage.action?pageId=50659557)
3. Now you can run the application with the "Start UI" function in the ["Quick Launch"](https://rapidclipse.atlassian.net/wiki/display/DOCEN/Quick+Launch) view.

### Important code

The relevant code is located in some views and columnGenerators that can be found in the subpackages of the "User Interface" area of the projects.
The code in the *generators* is located below ```this.initUI();```, and for the views "ShowEmployee" ane "ShowPDF" in the ```table_valueChange``` event method.

The MainView is just to navigate to the views.
