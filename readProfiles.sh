#! /bin/bash
mvn help:all-profiles |
grep "Profile Id:\|Listing Profiles" |
awk '{print $3}' |
sed  "s/Profiles//" |
sed "s/for//"