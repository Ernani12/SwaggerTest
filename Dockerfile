# Use uma imagem base do OpenJDK 17 (ou outra versão do JDK que você esteja usando)
FROM openjdk:17-jdk-alpine

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR gerado para o diretório de trabalho do contêiner
COPY target/*.jar app.jar

# Exponha a porta 8080 para o tráfego externo
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
