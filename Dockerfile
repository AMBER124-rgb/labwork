FROM openjdk:12-alpine
WORKDIR /Largest
COPY . /Largest
RUN javac Largest.java
CMD ["java","Largest"]