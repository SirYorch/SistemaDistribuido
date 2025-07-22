# Construir y ejecutar todos los servicios
docker-compose up --build

# Ejecutar en segundo plano
docker-compose up -d --build

# Ver logs
docker-compose logs -f

# Parar servicios
docker-compose down

# Parar y eliminar volúmenes
docker-compose down -v

# Aplicar configuraciones
kubectl apply -f postgres-secret.yaml
kubectl apply -f postgres-configmap.yaml
kubectl apply -f postgres-pvc.yaml

# Aplicar deployments
kubectl apply -f database-deployment.yaml
kubectl apply -f microservice-deployment.yaml

# Aplicar services
kubectl apply -f database-service.yaml
kubectl apply -f microservice-service.yaml

kubectl wait --for=condition=ready pod -l app=postgres --timeout=300s
kubectl wait --for=condition=ready pod -l app=universidades-microservice --timeout=300s
