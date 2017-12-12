cd ..\bin
set CLASSPATH=.;..\lib\derby.jar;..\lib\derbynet.jar;..\lib\derbytools.jar
rem java org.apache.derby.drda.NetworkServerControl start 
rem java -Xms128m -Xmx128m -Dderby.system.home=..\data org.apache.derby.drda.NetworkServerControl start 

java -Xms128m -Xmx128m -Dderby.system.home=..\data -Djava.security.manager -Djava.security.policy=..\lse\server.policy org.apache.derby.drda.NetworkServerControl start 

