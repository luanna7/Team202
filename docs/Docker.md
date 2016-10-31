# Docker Basic concept and Images

## Docker's client server architecture

+ client and daemon (server)
+ daemon is based on linux OS
+ you can access docker locally or remotely

## Install Docker

+ download Docker Toolbox and install on OS X
+ open the Docker cmd

## Basic Conceptions

+ images(class) vs container(a runtime object of that class)
+ registries(where we store our images)
+ repositories(a collection of different docker images with the same name)
+ docker Hub(has official repositories). we can find a lot of repositories here.
+ Chain RUN Instructions: executed on the top writable layer of the container, then commit the container as a new image as a new image layer

## Docker Command Line

```
docker-machine ls 
```
+ list all the docker machines such as default daemon

```
docker-machine version
```

```
$ docker run -it --rm busybox
```
+ [install Busybox image](https://hub.docker.com/_/busybox/)

```
docker images
```
+ list all the local images

```
docker run busybox:1.25 
(repositories:version)(command to run [arguments])
docker run -i -t busybox:1.25  
```
+ create the container using the image and spin up the container and run the command
+ put the arguement into the command.
+ -i -t go into a bash shell environment. It can start an interactive container. -t can creates a pseudo-TTY that attaches stdin and stdout.

```
docker run -d busybox:1.25 sleep 1000
docker ps
docker ps -a
docker run --rm busybox:1.25 sleep 1
```
+ run the docker background
+ show the docker daemon running background
+ show all the docker img that previously run and list all the containerID 
+ containers run 1 second and exit so we can not see it when we use ps command
+ the container has been removed by docker as soon as it ends

```
docker run --name "hello_world" busybox:1.25 sleep 2
docker inspect container_id
```
+ give the container a specific name
+ get some details information about the container

```
docker run -d busybox:1.25 sleep 2
docker inspect containerID
```
+ get more details about the docker containers

```
$ docker run -it --rm tomcat:9.0
$ docker run -it --rm -p 8888:8080 tomcat:9.0
$ docker run -it -d -p 8888:8080 tomcat:9.0
```
+ [tomcat](https://hub.docker.com/_/tomcat/)
+ second command line: how to access tomcat server? We can go to http://localhost:8888 or http://host-ip:8888 in a browser
+ We can get the host-ip, such as http://192.168.99.100:8888/ and then http://container-ip:8080
+ first command line: We can go to http://container-ip:8080
+ -p (host port):(container port)

```
docker history busybox:1.25
```
+ history commands: display the full set of layers which make up a image.
+ images commands: display all the images on the local boxes.
+ [dockerArchitecture](https://github.com/HenryWan19/Algorithm/blob/master/images/DockerArchitecture.PNG)
+ writable container

``` bash shell command on Debian
apt-get update && apt-get install -y git
```
+ update firstly then install
+ -y means Yes
+ install git in the container

```
docker commit containerID (NewimageName):(version tag)
```
+ the first way to build a docker image.
+ spin up a container from a base image.
+ commit changes made in the container to build a new image

```
FROM debian:jessie
RUN apt-get update
RUN apt-get install -y git
RUN apt-get install -y vim
```
+ the second way to build a docker image by dockerfile
+ each instruction in the dockerfile will create a new image layer to the image.
+ instructions specify what to do when building the image.

```
FROM debian:jessie
RUN apt-get update && 
    apt-get install -y \
    git \
    vim
CMD ["echo", "hello world"]
```
+ CMD instructions are executed when the container starts up
+ docker caching reuses the images before.

```
FROM debian:jessie
RUN apt-get update && 
    apt-get install -y \
    git \
    vim
COPY abc.txt /src/abc.txt
```
+ copy the abc.txt file to the container
+ add command can download file from the internet and copy it into the container.
+ add command can automatically unpack compressed file.

```
docker tag ImageID NewRepositoryName:Version
docker login --username=YourDockhubUserName
docker push RepositoryName:Version
```
+ create a image on the docker hub
+ reflash the dockerhub page

```
docker build -t (NewimageName):(version tag) .
```
+ -t means test
+ . is docker path






















