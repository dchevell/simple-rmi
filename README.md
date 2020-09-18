# simple-rmi
# Simple Java RMI example

git clone https://github.com/0xluk3/simple-rmi.git
cd simple-rmi
javac *.java
rmiregistry 11099 &

# Then, start server:
java Server

# Run client:
java Client / java Client2

