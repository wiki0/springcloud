#!/usr/bin/env bash

mvn clean package -Dmaven.test.skip=true -U

docker build -t registry.ap-southeast-1.aliyuncs.com/wiki0/config .

docker push registry.ap-southeast-1.aliyuncs.com/wiki0/config