# Build
mvn clean package && docker build -t fr.hitema/jpajaxrs .

# RUN

docker rm -f jpajaxrs || true && docker run -d -p 8080:8080 -p 4848:4848 --name jpajaxrs fr.hitema/jpajaxrs 