FROM openjdk:8-jdk-alpine

# Metadata
LABEL module.name="restaurants-dev"	


COPY *.jar app.jar

# logs folder
RUN mkdir -p /var/log && \
	mkdir ./target


# create user
RUN addgroup -S user -g 433 && adduser -u 431 -S -g user -h /usr/local -s /sbin/nologin user

RUN  chown -R user:user /var/log && \
	 chmod -R 777 /var/log && \
	 chown user:user app.jar && \
	 chown -R user:user ./target && \    
     chmod -R 777 ./target
	 
	 
VOLUME ["/var/log/platform-logs"]


USER user

EXPOSE 30010


ENV JAVA_OPTS="$JAVA_OPTS -Xms1G -Xmx3G" \
    SERVER_NAME=http://localhost:18000/ \
	ONESAIT_SERVER_NAME=http://localhost:18000/ \
	DEVICE_TOKEN=51b87fcb0757437db6a1e7ce1d0b3473 \
	DEVICE_TEMPLATE=RestaurantsDeviceMicroservice \
	DEVICE_ID=restaurants-dev \
	PORT=30010 \
	CONTEXT_PATH=/restaurants-dev \
	OAUTH_CLIENT=onesaitplatform \
	OAUTH_SECRET=onesaitplatform 

ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /app.jar

