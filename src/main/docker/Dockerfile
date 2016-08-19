FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD dashboard-1.0.0-SNAPSHOT.war dashboard.war
RUN sh -c 'touch /dashboard.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dashboard.war"]