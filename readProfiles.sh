#! /bin/bash
mvn help:all-profiles | grep "Profile Id:" | awk '{print $3}' | tr '\n' ','
