# Docker Web Application

## Web Application
```
git clone -b v0.1 https://github.com/jleetutorial/dockerapp.git
```
+ -b is another branch
+ Dockerfile and app inside

```
FROM python:3.5
RUN pip install Flask==0.11.1
RUN useradd -ms /bin/bash admin
USER admin
WORKDIR /app
COPY app /app
CMD ["python", "app.py"]
```
+ install and run python 3.5
+ install Flask with pip
+ add a new user "admin", and set the admin user to bash
+ running the app under the admin user or your app will run as a root.
+ use a non-privilige user to execute app

```
docker build -t dockerapp:v0.1 .
docker run -d -p 5000:5000 image_ID
```
+ build the python based image.

```
docker-machine ls
```
+ show the default docker Machine

```
docker exec -it ContainerID bash
```
+ run the bash on the container
+ run the machine as user admin

```
ps axu
```
+ show all the processes running on the container

```
git stash && git checkout v0.2
subl .
```
+ stash any changes make in your working directory
+ edit
+ using python redis client which provides some api such as get post

```
docker run -d --name redis redis:3.2.0
docker build -t dockerapp:v0.3
docker run -d -p 5000:5000 --link redis dockerapp:v0.3
docker exec -it ContainerID bash

```
+ link python app container with redis container
+ rename the name of the image
+ log on the redis container and execute bash shell
+ with the help of the link, we can run many independent components in different  containers.
+ Docker creates a secure tunnel between the containers that doesnt need to expose any ports externally on the container.

```
more /etc/hosts
```
+ get details on the /etc/hosts file to know more about ip and machine

```
docker-compose up
```
+ docker compose manages many links
+ docker-compose up will build all the services defined in the yml file.
+ docker-compose use yml files to store all the configurations.

```
git stash && git checkout v0.4
```

```
docker-compose up -d
docker-compose logs -f
docker-compose stop
docker-compose rm
docker-compose build
```
+ run the docker-compose on the background
+ stop all the containers without removing them
+ rm all the containers
+ force docker to rebuild images
+ [Docker_composer](https://github.com/HenryWan16/Images/blob/master/Docker_Composer.PNG)











