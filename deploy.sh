./mvnw blps clean install package
./mvnw mediaMicroservice clean install package

docker build blps/ -t "backend"
docker build mediaMicroservice/ -t "media-microservice"
docker compose up
