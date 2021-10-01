#!/bin/bash
echo "my script"
git clone git@morty.billongroup.com:durable-media/bem/bem-common
cd bem-common/dm-model/dm-db-chm
#ssh -N -L 5431:10.0.6.21:5432 -N piotrk@10.0.6.21 & pid=$!
#echo "killing ssh tunnel $pid"

mvn clean install liquibase:dropAll liquibase:update -Dliquibase.contexts=all,mvp,agreements

# script for ssh connection with script on server side
#ssh -i /home/pkaminski/.ssh/new-key -l jenkins 10.0.6.21 "
#  echo 'hello from jenkins' > test.txt
#"


#kill $pid
cd ../../..
rm -r bem-common || true