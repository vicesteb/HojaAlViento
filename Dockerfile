FROM openjdk:alpine
MAINTAINER Galileo Martinez "playgali@gmail.com"
ENV REFRESHED_AT 2018-Jun-12
ENV GRADLE_VERSION 4.8
ENV PATH="/opt/gradle-${GRADLE_VERSION}/bin:${PATH}"

COPY . /data
WORKDIR /data
RUN apk add --no-cache unzip \
 && wget https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip \
 && mkdir -p /opt \
 && unzip -d /opt gradle-$GRADLE_VERSION-bin.zip \
 && rm gradle-$GRADLE_VERSION-bin.zip \
 && apk del --no-cache unzip \
 && gradle build

EXPOSE 8080
CMD ["gradle","bootRun"]
