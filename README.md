# Chat Application

<b>Project Idea & Objective:</b>
The idea behind the project is to create an application that can talk to each other(chat) in the same computer or different computers on the same network.</br>

<b>Concept:</b>
Socket: A socket is defined as an endpoint for communication. A pair of processes communicating over a network employs a pair of sockets—one for each process. A socket is identified by an IP address concatenated with a port number. In general, sockets use a client–server architecture. The server waits for incoming client requests by listening to a specified port. Once a request is received, the server accepts a connection from the client socket to complete the connection.

<b>Walkthrough</b>
<ul><li>The server blocks waiting for a client to connect to it</li>
<li>A client connects</li>
<li>The server and the client exchange information until they're done</li>
<li>The client and the server both close their connection</li></ul>

<b>Address:</b>
<ul><li>Port Address and IP address is given to both client and server.</li>
<li>When the socket connection is established both client and server listens each others port.</li></ul>

<b>How to execute this file:</b>
<p>You can execute either using Eclipse IDE or put all the files in a zip file and open a two cmd prompts for server and 
client, then execute the server program first. Next, execute the client program then Input some message from each window and check whether it is recieved on both the ends.</p>

<b>NOTE</b>
While executing the program, If you find any "binding error" then check in your computer whether the particular port given in the program is already being used by some other running process. If you find one stop the process and reexcute the program again.

<b>Programming Language:</b>
Java 

<b>Software Requirements:</b>
Eclipse IDE Editor or a Notepad 

<b>System Requirement:</b>
You can execute the program in any OS environment such as Windows, MAC or Linux etc., I have programmed the application using Windows operating system. 
