#!/bin/bash
ssh -l jenkins@10.0.6.21 "
  echo 'hello from jenkins' > test.txt
"