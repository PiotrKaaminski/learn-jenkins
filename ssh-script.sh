#!/bin/bash
whoami
ssh -i /home/pkaminski/.ssh/new-key -l jenkins 10.0.6.21 "
  echo 'hello from jenkins' > test.txt
"