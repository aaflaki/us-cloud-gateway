## To start the micro-services environment follow these steps:

- run service-registry server
- run keycloak: ./standalone.sh -Djboss.http.port=8180
  - add users: localhost:8180
- run vault server in dev and copy token value put it in each of the services that uses vault
- vault server -dev 
  - export VAULT_ADDR='http://127.0.0.1:8200' 
  - vault kv put secret/service-name @key-value-file.json 
  - vault kv get secret/service-name
- start RabbitMQ broker : sudo service rabbitmq-server start / status
