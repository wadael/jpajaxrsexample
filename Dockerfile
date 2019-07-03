FROM airhacks/glassfish
COPY ./target/jpajaxrs.war ${DEPLOYMENT_DIR}
