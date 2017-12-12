#!/bin/bash
 
DIR=`dirname $0`
DIR=`cd $DIR/..;pwd`
DATA=$DIR/data
BIN=$DIR/bin
LIB=$DIR/lib
LSE=$DIR/lse

cd $BIN
export CLASSPATH=.:$LIB/derby.jar:$LIB/derbynet.jar:$LIB/derbytools.jar

exec java -Xms128m -Xmx128m -Dderby.system.home=$DATA -Djava.security.manager -Djava.security.policy=$LSE/server.policy org.apache.derby.drda.NetworkServerControl start 
