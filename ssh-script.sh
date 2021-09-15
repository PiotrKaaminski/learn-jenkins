#!/bin/bash
echo "my script"
#git clone git@morty.billongroup.com:durable-media/bem/bem-common
#cd bem-common/dm-model/dm-db-chm
ssh -N -L 12345:10.0.6.21:12345 -N piotrk@10.0.6.21 & pid=$!
echo "killing ssh tunnel $pid"


#ssh -i /home/pkaminski/.ssh/new-key -l jenkins 10.0.6.21 "
#  echo 'hello from jenkins' > test.txt
#"
rm -r bem-common