# Minimal Linux docker image with 5MB (https://hub.docker.com/_/alpine/)
FROM anapsix/alpine-java:8

MAINTAINER "thanhtam.nguyen@pycogroup.com"

ADD build/libs /opt

WORKDIR ["/opt"]

ENTRYPOINT ["java","-jar","*.jar"]