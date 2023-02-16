# sampledocker - Build a docker image using spring boot microservice

		Installed Softwares
		------------------- 
		Java 18
		Maven 3.x
		Docker Community edition 23.0.1


		#checkout code
		git clone https://github.com/narayanab16/sampledocker.git
		# Change dir
		cd sampledocker
		# maven build 
		mvnw clean package
		# Change dir
		cd docker 
		# build a docker tag
		docker buildx build -t sampledocker:1.0 .
		# run spring boot
		docker run -d --name my_image -p 8080:8080 sampledocker:1.0
		# test web url 
		curl localhost:8080 
		o/p: This is home page
		docker stop my_image
		# tag locally
		docker tag sampledocker:1.0 narayanab16/sampledocker:1.0
		# upload image to public docker repo
		docker login
		docker push narayanab16/sampledocker:1.0
		# my docker
		https://hub.docker.com/r/narayanab16/sampledocker
