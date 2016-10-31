# How to deploy you web app on docker

## Run a simple HelloWorld locally
+ Find the file DockerFile
+ using the following commands

### Commands Hello World
```
docker build -t dockerapp:v0.1 .
docker run -d -p 5000:5000 d980f21f3584
docker-machine ls
docker ps
docker ps -a
docker exec -it containerID bash
# ps axu
```
+ build the image
+ run the image on the docker machine
+ find the ip address
+ find the containerID and ImageID
+ exec bash after the image starts up
+ we can see the processes running on the commandline
+ using the admin user

```
$ git stash && git checkout v0.2
$ git branch
```
+ clear the working directory
+ checkout v0.2
+ change to the new branch

### Commands Key-value Paire
```
the same way to build and load images above
```







